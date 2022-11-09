package com.elowis.recyclerviews_llistes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<Datasource>()

        data.add(Datasource(R.drawable.ic_baseline_folder_24, "Eloy Castaño"))
        data.add(Datasource(R.drawable.ic_baseline_folder_24, "Manel Moreno"))
        data.add(Datasource(R.drawable.ic_baseline_folder_24, "Xevi Rodriguez"))
        data.add(Datasource(R.drawable.ic_baseline_folder_24, "David Muñoz"))
        data.add(Datasource(R.drawable.ic_baseline_folder_24, "Cristina Sanchez"))
        data.add(Datasource(R.drawable.ic_baseline_folder_24, "Pol Gómez"))
        data.add(Datasource(R.drawable.ic_baseline_folder_24, "Marc López"))
        data.add(Datasource(R.drawable.ic_baseline_folder_24, "Laura García"))
        data.add(Datasource(R.drawable.ic_baseline_folder_24, "Ana Maria"))


        val adapter = Adapter(data)

        recyclerview.adapter = adapter

    }
}
