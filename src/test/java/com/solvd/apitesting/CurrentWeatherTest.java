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
    // UPDATE: test failure disappeared after adding Atlanta test case. Cause unknown
    @Test
    public void verifyGetCurrentWeatherByLocationNewYork() {
        GetCurrentWeatherByLocation getCurrentWeatherByLocation =
                new GetCurrentWeatherByLocation(40.7128, -74.0060);

        getCurrentWeatherByLocation.expectResponseStatus(HttpResponseStatusType.OK_200);
        getCurrentWeatherByLocation.callAPI();

        getCurrentWeatherByLocation.validateResponse();
    }

    @Test
    public void verifyGetCurrentWeatherByLocationAtlanta() {
        GetCurrentWeatherByLocation getCurrentWeatherByLocation =
                new GetCurrentWeatherByLocation(33.753746, -84.386330);

        getCurrentWeatherByLocation.expectResponseStatus(HttpResponseStatusType.OK_200);
        getCurrentWeatherByLocation.callAPI();

        getCurrentWeatherByLocation.validateResponse();
    }

    // This test fails
    // java.lang.AssertionError: weather[]
    // Arrays length differs. Expected length=1 but actual length=2
    // Unexpected: snow
    @Test
    public void verifyGetCurrentWeatherByLocationTokyo() {
        GetCurrentWeatherByLocation getCurrentWeatherByLocation =
                new GetCurrentWeatherByLocation(35.652832, 139.839478);

        getCurrentWeatherByLocation.expectResponseStatus(HttpResponseStatusType.OK_200);
        getCurrentWeatherByLocation.callAPI();

        getCurrentWeatherByLocation.validateResponse();
    }

    // This test fails
    // Unexpected: grnd_level
    // Unexpected: sea_level
    // Unexpected: gust
    @Test
    public void verifyGetCurrentWeatherByLocationSeoul() {
        GetCurrentWeatherByLocation getCurrentWeatherByLocation =
                new GetCurrentWeatherByLocation(37.532600, 127.024612);

        getCurrentWeatherByLocation.expectResponseStatus(HttpResponseStatusType.OK_200);
        getCurrentWeatherByLocation.callAPI();

        getCurrentWeatherByLocation.validateResponse();
    }
}
