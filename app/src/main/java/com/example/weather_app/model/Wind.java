package com.example.weather_app.model;

public class Wind {

    private double speed;
    private double deg;
    private double gust;


    public Wind(double speed, double deg, double gust) {
        this.speed = speed;
        this.deg = deg;
        this.gust = gust;
    }


    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }

    public double getGust() {
        return gust;
    }

    public void setGust(double gust) {
        this.gust = gust;
    }
}
