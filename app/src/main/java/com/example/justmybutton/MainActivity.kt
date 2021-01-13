package com.example.justmybutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    val button: Button by lazy {findViewById(R.id.button)}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            Snackbar.make(button, getString(R.string.snackTxt), Snackbar.LENGTH_SHORT).show()
        }
    }
}