package com.solvd.apitesting;

import com.solvd.apitesting.api.GetCurrentAirPollutionByLocation;
import com.solvd.apitesting.api.GetCurrentWeatherByLocation;
import com.solvd.apitesting.domain.CurrentWeatherResponse;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static com.solvd.apitesting.utils.Generator.generateCurrentWeatherResponse;

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
