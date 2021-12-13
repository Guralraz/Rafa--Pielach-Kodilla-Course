package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemp() {
        double averageTemp = 0.0;
        double tempSum = 0.0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            tempSum = (tempSum + temperature.getValue());
        }

        averageTemp = (tempSum / temperatures.getTemperatures().size());

        return averageTemp;
    }

    public double calculateMedianTemp() {
        List<Double> temperatureList = new ArrayList<>();
        double medianTemp = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperatureList.add(temperature.getValue());
        }

        Collections.sort(temperatureList);

        if (temperatureList.size() % 2 == 0) {
            medianTemp = (temperatureList.get(temperatureList.size() / 2) +
                    temperatureList.get((temperatureList.size() / 2) - 1)) / 2;
        } else {
            medianTemp = temperatureList.get(temperatureList.size() / 2);
        }

        return medianTemp;
    }

}