package com.dicoding.picodiploma.mydiabetespredict.view.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.picodiploma.mydiabetespredict.R
import com.dicoding.picodiploma.mydiabetespredict.databinding.ActivityDiabetesInfoBinding

class DiabetesInfoActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDiabetesInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiabetesInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val back = binding.back

        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        val penjelasan = binding.constraintLayout1

        penjelasan.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://p2ptm.kemkes.go.id/infographic-p2ptm/penyakit-diabetes-melitus/page/5/yuk-mengenal-apa-itu-penyakit-diabetes-melitus-dm")))
        }
    }
}