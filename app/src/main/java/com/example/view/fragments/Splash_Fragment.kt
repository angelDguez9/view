package com.example.view.fragments

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.view.R


class Splash_Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        Handler().postDelayed({
            if(onBoardingFinished()){
                findNavController().navigate(R.id.action_splash_Fragment_to_eventos_Fragment)
            }else {
                findNavController().navigate(R.id.action_splash_Fragment_to_viewPageAdapter_Fragment)
            }
        },2000)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash_, container, false)
    }
    private fun onBoardingFinished(): Boolean{
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("finished", false)
    }
}