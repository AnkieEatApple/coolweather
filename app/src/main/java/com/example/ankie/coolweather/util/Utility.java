package com.example.ankie.coolweather.util;

import android.text.TextUtils;
import android.util.Log;

import com.example.ankie.coolweather.db.City;
import com.example.ankie.coolweather.db.County;
import com.example.ankie.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**********************************************************************
 * Utility工具类
 *
 * @author ankie
 * @类名 Utility
 * @包名 com.example.ankie.coolweather.util
 * @创建日期 2018/4/2
/**********************************************************************/

public class Utility {
    private static final String TAG = "Utility";
    /**
     * 解析和处理服务器返回的省级数据
     * @param response 返回的Json串
     * @return         解析成功/失败
     */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i ++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Log.e(TAG, "handleProvinceResponse: " + "provinceObject: " + provinceObject);
                    Province province = new Province();
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.setProvinceName(provinceObject.getString("name"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     * @param response      返回的Json串
     * @param provinceId    省ID
     * @return              成功/失败
     */
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i ++) {
                    JSONObject cityObject = allCities.getJSONObject(i);
                    Log.e(TAG, "handleCityResponse: " + "cityObject: " + cityObject);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i = 0; i < allCounties.length(); i ++) {
                    JSONObject countyObject = allCounties.getJSONObject(i);
                    Log.e(TAG, "handleCountyResponse: " + "countyObject: " + countyObject);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
