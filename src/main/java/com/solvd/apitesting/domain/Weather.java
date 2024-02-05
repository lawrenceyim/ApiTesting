package com.solvd.apitesting.domain;

public class Weather {
    private double latitude; // -90 to 90
    private double longitude; // -180 to 180
    private String weatherCategorization;
    private String description;

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

    public String getWeatherCategorization() {
        return weatherCategorization;
    }

    public void setWeatherCategorization(String weatherCategorization) {
        this.weatherCategorization = weatherCategorization;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
