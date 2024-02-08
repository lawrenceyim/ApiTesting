package com.solvd.carinatestautomation.api;

import com.solvd.carinatestautomation.api.GetGeocoding;
import com.solvd.carinatestautomation.api.domain.Geocode;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class GeocodeTest {
    @Test
    public void verifyGeocodeAtlanta() {
        GetGeocoding getGeocoding = new GetGeocoding(30309, "US");
        getGeocoding.expectResponseStatus(HttpResponseStatusType.OK_200);
        getGeocoding.callAPI();

        Geocode geocode = new Geocode();
        geocode.setName("Atlanta");
        geocode.setZipCode("30309");
        geocode.setCountryCode("US");
        getGeocoding.addProperty("geocode", geocode);

        getGeocoding.validateResponse();
    }
}
