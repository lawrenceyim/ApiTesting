package com.solvd.carinatestautomation.api;

import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class CurrentAirPollutionTest {
    @Test
    public void verifyGetCurrentAirPollutionByLocationWashingtonDc() {
        GetCurrentAirPollutionByLocation getCurrentAirPollutionByLocation =
                new GetCurrentAirPollutionByLocation(38.8951, -77.0364);

        getCurrentAirPollutionByLocation.expectResponseStatus(HttpResponseStatusType.OK_200);
        getCurrentAirPollutionByLocation.callAPI();
        getCurrentAirPollutionByLocation.validateResponse();
    }
}
