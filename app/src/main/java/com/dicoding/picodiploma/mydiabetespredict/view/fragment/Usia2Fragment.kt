package com.dicoding.picodiploma.mydiabetespredict.view.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.dicoding.picodiploma.mydiabetespredict.R
import com.dicoding.picodiploma.mydiabetespredict.view.activity.MainActivity
import com.dicoding.picodiploma.mydiabetespredict.viewmodel.QuestionViewModel

class Usia2Fragment : Fragment() {
    private lateinit var viewModel : QuestionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_usia2, container, false)
        val kelompok1 = view.findViewById<Button>(R.id.usia_2_kelompok_1)
        val kelompok2 = view.findViewById<Button>(R.id.usia_2_kelompok_2)
        val kelompok3 = view.findViewById<Button>(R.id.usia_2_kelompok_3)
        val back = view.findViewById<ConstraintLayout>(R.id.back26)
        val question = view.findViewById<TextView>(R.id.usia2_question)
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[QuestionViewModel::class.java]

        question.text = viewModel.usia()

        back.setOnClickListener {
            activity?.let {
                val intent = Intent(it, MainActivity::class.java)

                it.startActivity(intent)
            }
        }

        kelompok1.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.usia2_kelompok1_ke_genital2)
        }

        kelompok2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.usia2_kelompok2_predict)
        }

        kelompok3.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.usia2_kelompok3_predict)
        }

        return view
    }
}