package com.example.fakecalling

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.fakecalling.R.id.number
import com.example.fakecalling.R.id.textInputEditText
import com.google.android.material.snackbar.ContentViewCallback
import org.w3c.dom.Text

class CallScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    private lateinit var callerName : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call_screen)
        callerName = findViewById(R.id.number)

        val name = intent.getStringExtra("number")
        callerName.text = name

    }
}