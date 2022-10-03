package com.example.ernproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class WelcomeActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        supportActionBar?.hide()

        /*editText= findViewById(R.id.medittxt)*/
        button= findViewById(R.id.sbutton)
        button.setOnClickListener { val intent = Intent(this, OtpActivity::class.java)
            startActivity(intent) }
    }
}