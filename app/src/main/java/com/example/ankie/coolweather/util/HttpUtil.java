package com.example.ankie.coolweather.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**********************************************************************
 * OkHttp 类
 *
 * @author ankie
 * @类名 HttpUtil
 * @包名 com.example.ankie.coolweather.util
 * @创建日期 2018/4/2
/**********************************************************************/

public class HttpUtil {
    private static final String TAG = "HttpUtil";
    /**
     * 发送一条请求
     * @param address   地址
     * @param callback  注册的回调
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        Log.e(TAG, "sendOkHttpRequest: " + "发送一条请求!");
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
