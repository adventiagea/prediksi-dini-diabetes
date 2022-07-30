package com.dicoding.picodiploma.mydiabetespredict.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.dicoding.picodiploma.mydiabetespredict.databinding.ActivityPredictBinding

class PredictActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPredictBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPredictBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}