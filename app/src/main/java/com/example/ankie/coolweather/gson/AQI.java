package com.example.ankie.coolweather.gson;

/**********************************************************************
 *
 *
 * @author ankie
 * @类名 AQI
 * @包名 com.example.ankie.coolweather.gson
 * @创建日期 2018/4/6
/**********************************************************************/

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;
    }
}
