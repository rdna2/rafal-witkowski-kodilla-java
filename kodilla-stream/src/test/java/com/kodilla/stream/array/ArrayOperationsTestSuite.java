package com.kodilla.stream.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int numbers [] = {12,9,3,7,0,5,4,4,10,32,2,17,1,32};

        double avr = 0;
        for (int i =0; i<numbers.length; i++){
           avr += numbers[i];
                  }
        double averageExpected= avr/numbers.length;
        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(averageExpected, average, 0.0001);
    }
}