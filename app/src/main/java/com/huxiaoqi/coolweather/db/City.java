package com.huxiaoqi.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by huxiaoqi on 2017/3/20.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int proviceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }
}
