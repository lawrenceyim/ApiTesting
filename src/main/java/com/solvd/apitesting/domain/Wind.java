package com.solvd.apitesting.domain;

public class Wind {
    private double speed;
    private int deg;
    private boolean gust;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public boolean isGust() {
        return gust;
    }

    public void setGust(boolean gust) {
        this.gust = gust;
    }
}
