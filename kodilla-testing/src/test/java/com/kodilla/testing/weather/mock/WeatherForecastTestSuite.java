package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    private static int testCounter;

    @Mock
    private Temperatures temperaturesMock;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Executing tests: ");
    }

    @BeforeEach
    public void before() {
        testCounter++;
        System.out.println("Test: #" + testCounter);
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);


        double average = (25.5+26.2+24.8+25.2+26.1)/5;

        //When
        double averageTemp = weatherForecast.calculateAverageTemp();

        //Then
        Assertions.assertEquals(average, averageTemp, 0.002);
    }

    @Test
    void testCalculateMedianTemp() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double median = weatherForecast.calculateMedianTemp();

        //Then
        Assertions.assertEquals(25.5, median);
    }
}
