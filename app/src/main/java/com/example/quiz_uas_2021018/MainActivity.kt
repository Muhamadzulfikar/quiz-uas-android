package com.example.quiz_uas_2021018

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pinjaman = findViewById<EditText>(R.id.pinjaman)
        val name = findViewById<EditText>(R.id.name)
        val title = findViewById<EditText>(R.id.title)
        val duration = findViewById<EditText>(R.id.duration)
        val price = findViewById<EditText>(R.id.price)
        val category = findViewById<RadioGroup>(R.id.category)
        val submit = findViewById<Button>(R.id.submit)

        submit.setOnClickListener {
            val isRadioChecked = category.checkedRadioButtonId
            val isCategory = findViewById<RadioButton>(isRadioChecked)

            val textPinjaman = pinjaman.text.toString()
            val textName = name.text.toString()
            val textTitle = title.text.toString()
            val textDuration = duration.text.toString().toInt()
            val textPrice = price.text.toString().toInt()
            val textCategory = isCategory.text.toString()

            Intent(this, SecondActivity::class.java).also {
                it.putExtra("EXTRA_PINJAM", textPinjaman)
                it.putExtra("EXTRA_NAME", textName)
                it.putExtra("EXTRA_TITLE", textTitle)
                it.putExtra("EXTRA_DURATION", textDuration)
                it.putExtra("EXTRA_PRICE", textPrice)
                it.putExtra("EXTRA_CATEGORY", textCategory)
                startActivity(it)
            }
        }
    }
}