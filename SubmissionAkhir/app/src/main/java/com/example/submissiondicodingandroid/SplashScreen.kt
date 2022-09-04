package com.example.submissiondicodingandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val actionBar = supportActionBar
        actionBar!!.title = ""
        actionBar.setDisplayHomeAsUpEnabled(false)
        val background = object :Thread(){
            override fun run() {
                try {
                    Thread.sleep(2500)
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.fadein, R.anim.fadeout)
                }catch (e:Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}