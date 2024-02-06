package com.solvd.apitesting.domain;

public class CurrentWeatherResponse {
    private boolean hasGust;
    private boolean hasGroundLevel;
    private boolean hasSeaLevel;

    public boolean isHasGust() {
        return hasGust;
    }

    public void setHasGust(boolean hasGust) {
        this.hasGust = hasGust;
    }

    public boolean isHasGroundLevel() {
        return hasGroundLevel;
    }

    public void setHasGroundLevel(boolean hasGroundLevel) {
        this.hasGroundLevel = hasGroundLevel;
    }

    public boolean isHasSeaLevel() {
        return hasSeaLevel;
    }

    public void setHasSeaLevel(boolean hasSeaLevel) {
        this.hasSeaLevel = hasSeaLevel;
    }
}
