package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {


    private static Logger log1;

    @BeforeAll
    public static void openSettingsFile() {
        log1 = Logger.INSTANCE;
        log1.log("Log");
    }

    @AfterAll
    public static void closeSettingsFile() {
        log1.getLastLog();
    }

    @Test
    void testGetFileName() {
        //Given
        //When
        String lastLog1 = log1.getLastLog();
        System.out.println("Last log: " + lastLog1);
        //Then
        assertEquals("Log", lastLog1);
    }


}


