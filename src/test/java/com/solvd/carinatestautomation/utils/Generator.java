package com.solvd.carinatestautomation.utils;

import com.solvd.carinatestautomation.api.domain.CurrentWeatherResponse;
import io.restassured.response.Response;

public class Generator {
    public static CurrentWeatherResponse generateCurrentWeatherResponse(Response response) {
        String responseBody = response.getBody().asString();
        CurrentWeatherResponse weather = new CurrentWeatherResponse();
        weather.setHasGust(responseBody.contains("gust"));
        weather.setHasGroundLevel(responseBody.contains("grnd_level"));
        weather.setHasSeaLevel(responseBody.contains("sea_level"));
        return weather;
    }
}
