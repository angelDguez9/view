package com.example.view.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.view.R
import kotlinx.android.synthetic.main.fragment_onboarding1_.view.btnNext
import kotlinx.android.synthetic.main.fragment_onboarding2_.view.*

class Onboarding2_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_onboarding2_, container, false)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.vp)

        view.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_viewPageAdapter_Fragment_to_eventos_Fragment)
            onBoardingFinished()


        }

        view.txtSkip1.setOnClickListener {
            findNavController().navigate(R.id.action_viewPageAdapter_Fragment_to_eventos_Fragment)
            onBoardingFinished()

        }

        view.imgBack.setOnClickListener {
            viewPager?.currentItem = 0
        }
        return view
    }
    private fun onBoardingFinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("finished", true)
        editor.apply()
    }

}