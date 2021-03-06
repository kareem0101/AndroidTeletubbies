package com.example.teletubbies_task_4.data

import com.example.teletubbies_task_4.data.models.remote.MovieRatedResponse
import com.example.teletubbies_task_4.data.models.remote.MovieResponse
import com.example.teletubbies_task_4.data.ui.Movie
import com.example.teletubbies_task_4.data.ui.MovieRated
import java.util.*

class MovieRatedMapper {
    var joinedList = LinkedList<MovieRated>()
    fun mapToMovieRatedUi(movieResponse: MovieRatedResponse): List<MovieRated> {
        val Movies = mutableListOf<MovieRated>()
        var title = ""
        var posterPortrait = ""
        var rating = ""
        var language = ""
        var release =""
        var description = ""

        movieResponse.resultsList.forEach {

            Movies.add(MovieRated(it.id,it.title, it.posterPortrait, it.rating, it.language,it.release, it.description))
        }

        //adds the new list after the older version.
        joinedList.addAll(Movies)
        //returing the linked list for the whole code to deal with.
        return joinedList
    }
}