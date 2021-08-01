package com.example.cinevicode

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "9d256d66c7a650c6dcf5251905c2233a",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}