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

class JK3Fragment : Fragment() {
    private lateinit var viewModel : QuestionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_j_k3, container, false)
        val buttonLakiLaki = view.findViewById<Button>(R.id.jk3_lakilaki_button)
        val buttonPerempuan = view.findViewById<Button>(R.id.jk3_perempuan_button)
        val back = view.findViewById<ConstraintLayout>(R.id.back14)
        val question = view.findViewById<TextView>(R.id.jk3_question)
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[QuestionViewModel::class.java]

        question.text = viewModel.jk()

        back.setOnClickListener {
            activity?.let {
                val intent = Intent(it, MainActivity::class.java)

                it.startActivity(intent)
            }
        }

        buttonLakiLaki.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.jk3_lakilaki_ke_marah2)
        }

        buttonPerempuan.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.jk3_perempuan_ke_botak3)
        }

        return view
    }

}