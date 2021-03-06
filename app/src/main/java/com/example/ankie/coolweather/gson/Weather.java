package com.example.ankie.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**********************************************************************
 * Weather 天气类
 *
 * @author ankie
 * @类名 Weather
 * @包名 com.example.ankie.coolweather.gson
 * @创建日期 2018/4/6
/**********************************************************************/

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("forecast")
    public List<Forecast> forecastList;
}
