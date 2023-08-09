package com.recepgemalmaz.harrypotterbookclub

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.recepgemalmaz.harrypotterbookclub.databinding.RecyclerRowTasarimiBinding


class karakterAdapter (val karakterListesi : ArrayList<karakterSinifi>): RecyclerView.Adapter<karakterAdapter.karakterSinifiHolder>() {

    class karakterSinifiHolder(val binding : RecyclerRowTasarimiBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): karakterSinifiHolder {
        val binding = RecyclerRowTasarimiBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return karakterSinifiHolder(binding)


    }

    override fun getItemCount(): Int {
        return karakterListesi.size
    }

    override fun onBindViewHolder(holder: karakterSinifiHolder, position: Int){
        holder.binding.recyclerTextView.text = karakterListesi.get(position).isim

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,Karakterler::class.java)

            MySingleton.secilenKarakter = karakterListesi.get(position)
            holder.itemView.context.startActivity(intent)

        }
    }


}