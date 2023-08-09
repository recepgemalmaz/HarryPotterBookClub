package com.recepgemalmaz.harrypotterbookclub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.recepgemalmaz.harrypotterbookclub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var karakterList: ArrayList<karakterSinifi>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        karakterList = ArrayList<karakterSinifi>()

        val harry = karakterSinifi("Harry Potter", "Harry Potter serisinin ana karakteri", R.drawable.harry)
        val hermione = karakterSinifi("Hermione Granger", "Harry Potter serisinin ana karakteri", R.drawable.hermione)
        val ron = karakterSinifi("Ron Weasley", "Harry Potter serisinin ana karakteri", R.drawable.ron)
        val malfoy = karakterSinifi("Draco Malfoy", "Harry Potter serisinin ana karakteri", R.drawable.malfoy)

        //listeye ekleme
        karakterList.add(harry)
        karakterList.add(hermione)
        karakterList.add(ron)
        karakterList.add(malfoy)


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val KarakterBookADAPTER = karakterAdapter(karakterList)
        binding.recyclerView.adapter = KarakterBookADAPTER

    }
}