package com.elowis.intents_activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnActivity2 = findViewById<ImageView>(R.id.btn1)
        btnActivity2.setOnClickListener {
            val i = Intent(this.applicationContext, Activity2::class.java)
            startActivity(i)
        }

        val btnActivity3 = findViewById<Button>(R.id.btn2)
        btnActivity3.setOnClickListener {
            val i = Intent(this.applicationContext, Activity3::class.java)
            startActivity(i)
        }

    }
}