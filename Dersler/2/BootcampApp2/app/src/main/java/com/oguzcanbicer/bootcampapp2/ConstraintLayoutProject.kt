package com.oguzcanbicer.bootcampapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class ConstraintLayoutProject : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout_project)

        val textInputEditTextUsername:TextInputEditText = findViewById(R.id.textInputEditTextUsername)
        val textInputEditTextPassword:TextInputEditText = findViewById(R.id.textInputEditTextPassword)
        val buttonLogin: MaterialButton = findViewById(R.id.buttonLogin)
        val buttonBack: MaterialButton = findViewById(R.id.buttonBack)

        buttonLogin.setOnClickListener {
            Toast.makeText(this,
                "${textInputEditTextUsername.text} - ${textInputEditTextPassword.text}",
                Toast.LENGTH_LONG).show()
        }
        buttonBack.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}