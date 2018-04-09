package com.example.ankie.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**********************************************************************
 * 解析json的基础类
 *
 * @author ankie
 * @类名 Basic
 * @包名 com.example.ankie.coolweather.gson
 * @创建日期 2018/4/6
/**********************************************************************/

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;


    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }

}
