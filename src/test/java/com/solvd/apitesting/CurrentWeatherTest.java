package com.solvd.apitesting;

import com.solvd.apitesting.api.GetCurrentWeatherByLocation;
import com.solvd.apitesting.domain.CurrentWeatherResponse;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static com.solvd.apitesting.utils.Generator.generateCurrentWeatherResponse;

public class CurrentWeatherTest {
    /*
    KNOWN ISSUES:
    main.feels_like changes between type:Double and type:Integer
    wind.speed changes between type:Double and type:Integer
    array length of weather[] may be longer than 1

    FIXED ISSUES:
    wind.gust may or may not exist in the response. (fixed by checking response for gust before validation)
    */

    @Test
    public void verifyGetCurrentWeatherByLocationWashingtonDc() {
        GetCurrentWeatherByLocation getCurrentWeatherByLocation =
                new GetCurrentWeatherByLocation(38.8951, -77.0364);

        getCurrentWeatherByLocation.expectResponseStatus(HttpResponseStatusType.OK_200);
        Response response = getCurrentWeatherByLocation.callAPI();
        CurrentWeatherResponse weather = generateCurrentWeatherResponse(response);
        getCurrentWeatherByLocation.addProperty("weather", weather);

        getCurrentWeatherByLocation.validateResponse();
    }

    @Test
    public void verifyGetCurrentWeatherByLocationNewYork() {
        GetCurrentWeatherByLocation getCurrentWeatherByLocation =
                new GetCurrentWeatherByLocation(40.7128, -74.0060);

        getCurrentWeatherByLocation.expectResponseStatus(HttpResponseStatusType.OK_200);
        Response response = getCurrentWeatherByLocation.callAPI();
        CurrentWeatherResponse weather = generateCurrentWeatherResponse(response);
        getCurrentWeatherByLocation.addProperty("weather", weather);

        getCurrentWeatherByLocation.validateResponse();
    }

    @Test
    public void verifyGetCurrentWeatherByLocationAtlanta() {
        GetCurrentWeatherByLocation getCurrentWeatherByLocation =
                new GetCurrentWeatherByLocation(33.753746, -84.386330);

        getCurrentWeatherByLocation.expectResponseStatus(HttpResponseStatusType.OK_200);
        Response response = getCurrentWeatherByLocation.callAPI();
        CurrentWeatherResponse weather = generateCurrentWeatherResponse(response);
        getCurrentWeatherByLocation.addProperty("weather", weather);

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
        Response response = getCurrentWeatherByLocation.callAPI();
        CurrentWeatherResponse weather = generateCurrentWeatherResponse(response);
        getCurrentWeatherByLocation.addProperty("weather", weather);

        getCurrentWeatherByLocation.validateResponse();
    }

    @Test
    public void verifyGetCurrentWeatherByLocationSeoul() {
        GetCurrentWeatherByLocation getCurrentWeatherByLocation =
                new GetCurrentWeatherByLocation(37.532600, 127.024612);

        getCurrentWeatherByLocation.expectResponseStatus(HttpResponseStatusType.OK_200);
        Response response = getCurrentWeatherByLocation.callAPI();
        CurrentWeatherResponse weather = generateCurrentWeatherResponse(response);
        getCurrentWeatherByLocation.addProperty("weather", weather);

        getCurrentWeatherByLocation.validateResponse();
    }
}
