package com.example.quiz_uas_2021018

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val result = findViewById<TextView>(R.id.result)

        val pinjaman = intent.getStringExtra("EXTRA_PINJAM")
        val name = intent.getStringExtra("EXTRA_NAME")
        val title = intent.getStringExtra("EXTRA_TITLE")
        val duration = intent.getIntExtra("EXTRA_DURATION", 0)
        val price = intent.getIntExtra("EXTRA_PRICE", 0)
        val category = intent.getStringExtra("EXTRA_CATEGORY")

        val hasilData = "No Pinjaman : $pinjaman \n" +
                "Nama Pelanggan : $name \n" +
                "Judul Film : $title \n" +
                "Harga Sewa : $price \n" +
                "Lama Sewa : $duration \n" +
                "Jenis Film : $category \n"

        result.text = hasilData

        val back = findViewById<Button>(R.id.back)

        back.setOnClickListener {
            finish()
        }
    }
}