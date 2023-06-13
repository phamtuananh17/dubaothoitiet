package com.example.weatherapp.models

import java.io.Serializable

data class WeatherResponse (
    val coord: Coord,
    val weather : List<Weather>,
    val base: String,
    val main: Main,
    val cloud : Clouds,
    val wind: Wind,
    val rain : Rain,
    val sys: Sys,
    val timezone : Int,
    val id : Int,
    val name : String,
    val cod : Int,
    val visibility : Int

) : Serializable






