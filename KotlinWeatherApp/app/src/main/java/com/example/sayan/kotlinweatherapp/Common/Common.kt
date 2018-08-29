package com.example.sayan.kotlinweatherapp.Common

import java.text.SimpleDateFormat
import java.util.*

object Common{
    val API_KEY = "a6256da806820b0c4043832ffe773e54"
    val API_LINK = "http://api.openweathermap.org/data/2.5/uea"

    fun apiRequest(lat:String,lng:String) :String
    {
        var sb=StringBuilder(API_LINK)
        sb.append("?lat=${lat}&lon=${lng}&APPID=${API_KEY}&units=metric")
        return sb.toString()
    }

    fun unixTimeStampToDateTime(unixTimeStamp:Double):String
    {
        val dateFormat = SimpleDateFormat("HH:mm")
        val date = Date()
        date.time=unixTimeStamp.toLong()*1000
        return dateFormat.format(date)
    }

    fun getImage(icon:String):String
    {
        return "http://openweathermap.org/img/w/${icon}.png"
    }

    val dateNow:String
        get() {
            val dateFormat = SimpleDateFormat("dd MM yyyy HH:mm")
            val date = Date()
            return dateFormat.format(date)
        }

}