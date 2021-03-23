package com.example.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.view.R

class Eventos_Fragment : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>? = null
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_eventos_, container, false)
        recyclerView = view.findViewById(R.id.rcv) as RecyclerView
        layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL,false)
        recyclerView.layoutManager = layoutManager

        adapter = RecyclerViewAdapter()
        recyclerView.adapter = adapter
        return  view
    }
}