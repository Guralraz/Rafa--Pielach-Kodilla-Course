package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    Map<String, Double> temperaturesMap = new HashMap<>();

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    public void beforeEach() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
    }

    @AfterEach
    public void afterEach() {
        temperaturesMap.remove("Rzeszow", 25.5);
        temperaturesMap.remove("Krakow", 26.2);
        temperaturesMap.remove("Wroclaw", 24.8);
        temperaturesMap.remove("Warszawa", 25.2);
        temperaturesMap.remove("Gdansk", 26.1);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageTemp() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When

        double averageTemp = weatherForecast.calculateAverageTemp();

        //Then
        Assertions.assertEquals(25.56, averageTemp);
    }

    @Test
    void testCalculateMedianTemp() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianTemp = weatherForecast.calculateMedianTemp();

        //Then
        Assertions.assertEquals(25.5, medianTemp);
    }

}
