package com.solvd.apitesting;

import com.solvd.apitesting.api.GetCurrentWeatherByLocation;
import com.solvd.apitesting.domain.Weather;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class CurrentWeatherTest {
    @Test
    public void verifyGetCurrentWeatherByLocation() {
        Weather weather = new Weather();
        weather.setLatitude(38.8951);
        weather.setLongitude(-77.0364);

        GetCurrentWeatherByLocation getCurrentWeatherByLocation =
                new GetCurrentWeatherByLocation(weather.getLatitude(), weather.getLongitude());
        getCurrentWeatherByLocation.addProperty("weather", weather);

        getCurrentWeatherByLocation.expectResponseStatus(HttpResponseStatusType.OK_200);
        getCurrentWeatherByLocation.callAPI();

        getCurrentWeatherByLocation.validateResponse();
    }
}
