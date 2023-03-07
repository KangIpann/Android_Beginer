package com.example.belajarintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton

class activity_input : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)
        val radiobtn1 : RadioButton = findViewById(R.id.rdb_1)
        val radiobtn2 : RadioButton = findViewById(R.id.rdb_2)
        val radiobtn3 : RadioButton = findViewById(R.id.rdb_3)
        val radiobtn4 : RadioButton = findViewById(R.id.rdb_4)
        val btnInput : Button = findViewById(R.id.btn_input)
        btnInput.setOnClickListener(this)
        radiobtn1.setOnClickListener(this)
        radiobtn2.setOnClickListener(this)
        radiobtn3.setOnClickListener(this)
        radiobtn4.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){

            R.id.btn_input -> {
                val bringBackData = Intent(this@activity_input, MainActivity::class.java)
                bringBackData.putExtra(MainActivity.EXTRA_RESULT,0)
            }
        }
    }
}

