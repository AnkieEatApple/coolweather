package com.example.ankie.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**********************************************************************
 * 解析json类 当前温度
 *
 * @author ankie
 * @类名 Now
 * @包名 com.example.ankie.coolweather.gson
 * @创建日期 2018/4/6
/**********************************************************************/

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }

}
