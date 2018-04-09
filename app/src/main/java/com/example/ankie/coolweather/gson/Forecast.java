package com.example.ankie.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**********************************************************************
 * 解析json天气情况
 *
 * @author ankie
 * @类名 Forecast
 * @包名 com.example.ankie.coolweather.gson
 * @创建日期 2018/4/6
/**********************************************************************/

public class Forecast {

    public String data;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
