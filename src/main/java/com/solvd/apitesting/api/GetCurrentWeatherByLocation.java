package com.solvd.apitesting.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.utils.config.Configuration;

public class GetCurrentWeatherByLocation extends AbstractApiMethodV2 {
    private static final String responsePath = "api/weather/get_current_weather_by_location_response.json";

    public GetCurrentWeatherByLocation(double lat, double lon) {
        super(null, responsePath);
        replaceUrlPlaceholder("base_url", Configuration.getRequired("base_url"));
        replaceUrlPlaceholder("lat", String.valueOf(lat));
        replaceUrlPlaceholder("lon", String.valueOf(lon));
        replaceUrlPlaceholder("app_id", Configuration.getRequired("app_id"));
        ignorePropertiesProcessor(NotStringValuesProcessor.class);
    }
}
