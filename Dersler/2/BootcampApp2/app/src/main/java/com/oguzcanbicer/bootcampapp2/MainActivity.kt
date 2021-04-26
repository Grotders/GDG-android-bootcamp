package com.oguzcanbicer.bootcampapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    lateinit var buttonFrameLayout: Button
    lateinit var buttonLinearLayout: Button
    lateinit var buttonConstraintsLayout: Button
    lateinit var buttonConstraintLayoutProject: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonFrameLayout = findViewById(R.id.buttonFrameLayout)
        buttonLinearLayout = findViewById(R.id.buttonLinearLayout)
        buttonConstraintsLayout = findViewById(R.id.buttonConstraintLayout)
        buttonConstraintLayoutProject = findViewById(R.id.buttonConstraintLayoutProject)

        buttonFrameLayout.setOnClickListener {
            frameLayout()
        }
        buttonLinearLayout.setOnClickListener {
            linearLayout()
        }
        buttonConstraintsLayout.setOnClickListener {
            constraintsLayout()
        }

        buttonConstraintLayoutProject.setOnClickListener {
            buttonConstraintLayoutProject()
        }

    }

    private fun frameLayout() {
        intent = Intent(this, FrameLayoutActivity::class.java)
        startActivity(intent)
    }

    private fun linearLayout() {
        intent = Intent(this, LinearLayoutActivity::class.java)
        startActivity(intent)
    }
    private fun constraintsLayout() {
        intent = Intent(this, ConstraintLayoutActivity::class.java)
        startActivity(intent)
    }
    private fun buttonConstraintLayoutProject() {
        intent = Intent(this, ConstraintLayoutProject::class.java)
        startActivity(intent)
    }
}