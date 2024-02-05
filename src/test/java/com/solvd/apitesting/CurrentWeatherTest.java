package com.solvd.apitesting;

import com.solvd.apitesting.api.GetCurrentWeatherByLocation;
import com.solvd.apitesting.domain.Weather;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class CurrentWeatherTest {
    @Test
    public void verifyGetCurrentWeatherByLocationWashingtonDc() {
        GetCurrentWeatherByLocation getCurrentWeatherByLocation =
                new GetCurrentWeatherByLocation(38.8951, -77.0364);

        getCurrentWeatherByLocation.expectResponseStatus(HttpResponseStatusType.OK_200);
        getCurrentWeatherByLocation.callAPI();

        getCurrentWeatherByLocation.validateResponse();
    }

    // This test fails
    // NewYork has a "gust": "type:Double" property in its response that Washington does not have
    @Test
    public void verifyGetCurrentWeatherByLocationNewYork() {
        GetCurrentWeatherByLocation getCurrentWeatherByLocation =
                new GetCurrentWeatherByLocation(40.7128, -74.0060);

        getCurrentWeatherByLocation.expectResponseStatus(HttpResponseStatusType.OK_200);
        getCurrentWeatherByLocation.callAPI();

        getCurrentWeatherByLocation.validateResponse();
    }
}
