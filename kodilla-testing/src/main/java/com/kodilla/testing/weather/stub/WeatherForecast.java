package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

                      resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double calculateAverageTemp() {

        double sum = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }

        return (sum / temperatures.getTemperatures().size());
        }

    public double calculateMedianTemp() {

        ArrayList<Double> medianCalculation = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            medianCalculation.add(temperature.getValue());
        }

        Collections.sort(medianCalculation);
        double middle;
        if (medianCalculation.size()%2 == 0) {
            middle = (medianCalculation.get(medianCalculation.size()/2) + medianCalculation.get(medianCalculation.size()/2 - 1))/2;
        } else {
            middle = medianCalculation.get(medianCalculation.size() / 2);
        }
        return middle;
    }


}
