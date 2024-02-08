package com.solvd.carinatestautomation.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.utils.config.Configuration;

public class GetGeocoding extends AbstractApiMethodV2 {
    public GetGeocoding(int zipCode, String countryCode) {
        super(null, "api/weather/get_geocoding_response.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("base_url"));
        replaceUrlPlaceholder("zip_code", String.valueOf(zipCode));
        replaceUrlPlaceholder("country_code", countryCode);
        replaceUrlPlaceholder("app_id", Configuration.getRequired("app_id"));
        ignorePropertiesProcessor(NotStringValuesProcessor.class);
    }
}
