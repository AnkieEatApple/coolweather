package com.example.ankie.coolweather.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**********************************************************************
 * Gson解析工具类
 *
 * @author ankie
 * @类名 GsonParser
 * @包名 com.example.ankie.coolweather.util
 * @创建日期 2018/4/16
/**********************************************************************/

public final class GsonParser {

    private static volatile GsonParser sGsonParser;

    private Gson mGson;

    private GsonParser() {
        mGson = new GsonBuilder().create();
    }

    public static GsonParser getInstance() {
        if (sGsonParser == null) {
            synchronized(GsonParser.class) {
                if (sGsonParser == null) {
                    sGsonParser = new GsonParser();
                }
            }
        }
        return sGsonParser;
    }

    public String serialize(Object src) {
        return mGson.toJson(src);
    }

    public String serialize(Object src, Type typeOfSrc) {
        return mGson.toJson(src, typeOfSrc);
    }

    public <T> T deserialize(String json, Class<T> classOfT) {
        try {
            return mGson.fromJson(json, classOfT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public <T> T deserialize(String json, Type typeOfT) {
        try {
            return mGson.fromJson(json, typeOfT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
