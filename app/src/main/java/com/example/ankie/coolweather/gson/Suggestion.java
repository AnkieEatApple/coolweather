package com.example.ankie.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**********************************************************************
 * 解析json天气建议
 *
 * @author ankie
 * @类名 Suggestion
 * @包名 com.example.ankie.coolweather.gson
 * @创建日期 2018/4/6
/**********************************************************************/

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("sport")
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
