package com.solvd.apitesting.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.utils.config.Configuration;

public class GetCurrentAirPollutionByLocation extends AbstractApiMethodV2 {
    public GetCurrentAirPollutionByLocation(double lat, double lon) {
        super(null, "api/weather/get_current_air_pollution_by_location_response.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("base_url"));
        replaceUrlPlaceholder("app_id", Configuration.getRequired("app_id"));
        replaceUrlPlaceholder("lat", String.valueOf(lat));
        replaceUrlPlaceholder("lon", String.valueOf(lon));
        ignorePropertiesProcessor(NotStringValuesProcessor.class);
    }
}
