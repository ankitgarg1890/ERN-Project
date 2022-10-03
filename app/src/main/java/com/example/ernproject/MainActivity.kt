package com.example.ernproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        supportActionBar?.hide()

        val handler= Handler(Looper.getMainLooper())
        handler.postDelayed({
              val intent= Intent(this@MainActivity,WelcomeActivity::class.java)
            startActivity(intent)
            finish()


        },2000)
        /*Handler().postDelayed(object : Runnable {

            override fun run() {
                startActivity(Intent(this@MainActivity, WelcomeActivity::class.java))
                finish()

            }

        }, 2000)*/


    }
}