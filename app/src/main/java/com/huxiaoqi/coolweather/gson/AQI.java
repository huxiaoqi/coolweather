package com.huxiaoqi.coolweather.gson;

/**
 * Created by huxiaoqi on 2017/3/22.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
