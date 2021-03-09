package com.example.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_view_page_adapter_.view.*

class ViewPageAdapter_Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val  view =  inflater.inflate(R.layout.fragment_view_page_adapter_, container, false)

        val fragmentList = arrayListOf<Fragment>(
            Onboarding1_Fragment(),
            Onboarding2_Fragment()
        )

        val adapter = ViewPageAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        view.vp.adapter = adapter

        return view
    }


}