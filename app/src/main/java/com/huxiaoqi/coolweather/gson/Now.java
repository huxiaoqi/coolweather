package com.huxiaoqi.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by huxiaoqi on 2017/3/22.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
