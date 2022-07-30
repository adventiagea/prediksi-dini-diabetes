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

class Gatal1Fragment : Fragment() {
    private lateinit var viewModel : QuestionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_gatal1, container, false)
        val buttonYes = view.findViewById<Button>(R.id.gatal1_yes_button)
        val buttonNo = view.findViewById<Button>(R.id.gatal1_no_button)
        val back = view.findViewById<ConstraintLayout>(R.id.back8)
        val question = view.findViewById<TextView>(R.id.gatal1_question)
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[QuestionViewModel::class.java]

        question.text = viewModel.gatal()

        back.setOnClickListener {
            activity?.let {
                val intent = Intent(it, MainActivity::class.java)

                it.startActivity(intent)
            }
        }

        buttonYes.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.gatal1_yes_ke_luka1)
        }

        buttonNo.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.gatal1_no_predict)
        }

        return view
    }

}