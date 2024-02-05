package com.solvd.apitesting.domain;

public class Weather {
    private double latitude; // -90 to 90
    private double longitude; // -180 to 180

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
