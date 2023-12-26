package com.duxiaoman.mvvmtest.logic.network

import com.duxiaoman.mvvmtest.SunnyWeatherApplication
import com.duxiaoman.mvvmtest.logic.model.DailyResponse
import com.duxiaoman.mvvmtest.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {

    /*获取实时天气信息*/
    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng:String,@Path("lat") lat:String): Call<RealtimeResponse>

    /*获取未来天气信息*/
    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>

}