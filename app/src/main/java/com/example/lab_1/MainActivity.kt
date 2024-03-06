package com.example.lab_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var languageText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        languageText = findViewById(R.id.textAt1)
        languageText.text = getString(R.string.act1Txt)

        val at2btn = findViewById<Button>(R.id.btnGoToAt2)
        at2btn.text = getString(R.string.gotoAct2Btn)
        at2btn.setOnClickListener{
            val intent = Intent(this,AT2::class.java)
            startActivity(intent)
        }

    }
}