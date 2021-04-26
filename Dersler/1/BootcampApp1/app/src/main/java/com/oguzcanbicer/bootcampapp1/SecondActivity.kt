package com.oguzcanbicer.bootcampapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var backButton : Button
    lateinit var textView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView = findViewById(R.id.textView)
        backButton = findViewById(R.id.backButton)

        val getData = intent.getStringExtra("send")
        textView.setText(getData)

        backButton.setOnClickListener {
            backPage()
        }
    }

    private fun backPage() {
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}