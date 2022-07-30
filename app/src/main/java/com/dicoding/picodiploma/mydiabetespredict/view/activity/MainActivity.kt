package com.dicoding.picodiploma.mydiabetespredict.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.picodiploma.mydiabetespredict.databinding.ActivityMainBinding

//Beranda
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val info = binding.infoDiabetes
        val predict = binding.predict
        val about = binding.about

        info.setOnClickListener{
            val intent = Intent(this, DiabetesInfoActivity::class.java)

            startActivity(intent)
        }

        predict.setOnClickListener{
            val intent = Intent(this, PredictActivity::class.java)

            startActivity(intent)
        }

        about.setOnClickListener{
            val intent = Intent(this, AboutActivity::class.java)

            startActivity(intent)
        }
    }
}