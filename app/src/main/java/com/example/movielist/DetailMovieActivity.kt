package com.example.movielist

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movielist.databinding.ActivityMainBinding
import com.example.movielist.models.Movie
import com.example.movielist.models.MovieResponse
import com.example.movielist.services.MovieApiInterface
import com.example.movielist.services.MovieApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.Resource
import com.example.movielist.databinding.ActivityDetailMovieBinding


class DetailMovieActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailMovieBinding


    companion object {
        const val EXTRA_MOVIES = "extra_movies"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailMovieBinding.inflate(layoutInflater)

        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.imgItemPhoto.clipToOutline = true




    }



    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}