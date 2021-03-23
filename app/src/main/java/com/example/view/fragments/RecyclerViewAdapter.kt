package com.example.view.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.view.R

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>()  {



   // private val itemtitle= arrayOf("Eventos de tu ciudad","Eventos de tu ciudad","Eventos de tu ciudad")
    private val itemTitles = arrayOf("Iglesia San Juan Apóstol", "Iglesia San Pedro","Iglesia del Sagrado Corazón de Jesús")
    private val itemDay = arrayOf("Misa dominical vespertina", "Misa dominical vespertina", "Misa dominical vespertina")
    private val itemImages = intArrayOf(
        R.drawable.guadalupe,
        R.drawable.fatima,
        R.drawable.sagrado
    )


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
       // var textTitle : TextView
        var image : ImageView
        var textdes : TextView
        var textday : TextView

        init {
           // textTitle = itemView.findViewById(R.id.item_title)
            image = itemView.findViewById(R.id.item_image)

            textdes = itemView.findViewById(R.id.item_details)
            textday = itemView.findViewById(R.id.item_day)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclermodel,parent,false)
        return ViewHolder(v)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //holder.textTitle.text = itemtitle[position]
        holder.image.setImageResource(itemImages[position])
        holder.itemView.setOnClickListener {v: View ->
            Toast.makeText(v.context, "Clicked on the item", Toast.LENGTH_SHORT).show()
        }
        holder.textdes.text = itemTitles[position]
        holder.textday.text = itemDay[position]
    }

    override fun getItemCount(): Int {
        return itemTitles.size
    }

}