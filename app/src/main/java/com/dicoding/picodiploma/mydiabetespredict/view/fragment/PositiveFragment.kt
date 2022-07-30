package com.dicoding.picodiploma.mydiabetespredict.view.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.dicoding.picodiploma.mydiabetespredict.R
import com.dicoding.picodiploma.mydiabetespredict.view.activity.MainActivity

class PositiveFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_positive, container, false)
        val back = view.findViewById<ConstraintLayout>(R.id.back1)
        val back2 = view.findViewById<Button>(R.id.kembali_1)

        back.setOnClickListener {
            activity?.let {
                val intent = Intent(it, MainActivity::class.java)

                it.startActivity(intent)
            }
        }

        back2.setOnClickListener {
            activity?.let {
                val intent = Intent(it, MainActivity::class.java)

                it.startActivity(intent)
            }
        }

        return view
    }

}