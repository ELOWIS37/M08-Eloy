package com.elowis.intents_activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)
        val toast = Toast.makeText(this, "Benvingut a l'Activity 2!", Toast.LENGTH_SHORT)
        toast.show()

        // Boto url
        val url = findViewById(R.id.button) as Button
        url.setOnClickListener {
            val url = "http://www.google.com"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        //Boto correu
        val correu = findViewById(R.id.button2) as Button
        correu.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            startActivity(Intent.createChooser(intent, "Select email"))
        }

        //Boto maps
        val maps = findViewById(R.id.button3) as Button
        maps.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("geo:0,0?q=37.423156,-122.084917")
            )
            startActivity(intent)
        }

        // Boto telefon
        val telefon = findViewById(R.id.button4) as Button
        telefon.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "665557609")
            startActivity(intent)
        }
    }
}