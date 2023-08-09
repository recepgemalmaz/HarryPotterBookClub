package com.recepgemalmaz.harrypotterbookclub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.recepgemalmaz.harrypotterbookclub.databinding.ActivityKarakterlerBinding
import com.recepgemalmaz.harrypotterbookclub.databinding.ActivityMainBinding

class Karakterler : AppCompatActivity() {

    private lateinit var binding: ActivityKarakterlerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKarakterlerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val secilenKarakter = MySingleton.secilenKarakter

        secilenKarakter?.let {
            binding.imageView.setImageResource(it.resim)
            binding.karakterAdi.text = it.isim
            binding.karakterOzellik.text= it.ozellik
        }



    }
}