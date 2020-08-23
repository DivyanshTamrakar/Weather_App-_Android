package com.example.weather_app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

    public static String API_KEY = "02b04ee09d0fafa00ea04a8982ef786e";
    public static String API_LINK = "https://api.openweathermap.org/data/2.5/weather";

    public static String apiRequest(String lat, String lon) {
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&appid=%s&units=metric", lat, lon, API_KEY));
        return sb.toString();

    }

    public static String unixToDate(double unixtimestamp) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long) unixtimestamp * 1000);
        return dateFormat.format(date);

    }


    public static String getImage(String icon) {

        return String.format("https://openweathermap.org/img/w/%s.png", icon);
    }

    public static String getDateNow() {

        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }


}

