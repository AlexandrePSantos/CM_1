package com.example.lab_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AT2 : AppCompatActivity() {

    private lateinit var languageText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at2)

        languageText = findViewById(R.id.textA2_1)
        languageText.text = getString(R.string.act2Txt)
        languageText = findViewById(R.id.textA2_2)
        languageText.text = getString(R.string.act2IdAluno)

        val closeBtn = findViewById<Button>(R.id.btnClose)
        closeBtn.text = getString(R.string.close_activity_2)
        closeBtn.setOnClickListener {
            finish()
        }
    }
}