package com.example.fakecalling

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageButton
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
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar?.hide()
        setContentView(R.layout.activity_call_screen)
        callerName = findViewById(R.id.number)

        val name = intent.getStringExtra("number")
        callerName.text = name

        val answerButton = findViewById<ImageButton>(R.id.imageButton)
        answerButton.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(this, answerCall::class.java).putExtra("number",callerName.text.toString()))
                })

    }
}