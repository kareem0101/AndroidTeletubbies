package com.example.teletubbies_task_4.data.database

import com.example.teletubbies_task_4.data.ui.Movie

//add dependency then remove // from the comment and check the interface with class Movie.kt

//@Dao
interface MovieDao {
    //@Insert
    fun addForecasts(movie: List<Movie>)

    //@Query("SELECT * FROM MOVIE")
    fun getAllForecasts(): List<Movie>

    //@Delete
    fun deleteForecast(movie: Movie)

    //@Query("DELETE FROM Movie")
    fun deleteAll()
}