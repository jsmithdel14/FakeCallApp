package com.example.fakecalling

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextClock
import android.widget.TextView
import java.net.URI

class MainActivity : AppCompatActivity() {

    private lateinit var callerName : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        callerName = findViewById(R.id.textInputEditText)
        val callButton = findViewById<Button>(R.id.button)

        callButton.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, CallScreen::class.java)
                .putExtra("number",callerName.text.toString()))})

//        callButton.setOnClickListener(View.OnClickListener {
//            var intent = Intent(Intent.ACTION_);
//            intent.setData(Uri.parse("tel:6055551212"));
//            startActivity(intent)
//
//        })
    }
}