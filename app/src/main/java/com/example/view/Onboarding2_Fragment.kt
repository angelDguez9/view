package com.example.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_onboarding1_.view.*
import kotlinx.android.synthetic.main.fragment_onboarding1_.view.btnNext
import kotlinx.android.synthetic.main.fragment_onboarding2_.view.*

class Onboarding2_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_onboarding2_, container, false)
        view.btnNext.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_onboarding2_Fragment_to_eventos_Fragment) }
        return view
    }

}