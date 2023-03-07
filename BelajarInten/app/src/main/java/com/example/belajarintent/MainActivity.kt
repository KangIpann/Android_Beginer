package com.example.belajarintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity(), View.OnClickListener {
    companion object{
        const val EXTRA_RESULT = "extra_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity : Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)
        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)
        val btnDialPhone : Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)
        val btnMoveToInput : Button = findViewById(R.id.btn_move_activity_input)
        btnMoveToInput.setOnClickListener(this)
        val btnMoveClass : Button = findViewById(R.id.btn_move_activity_class)
        btnMoveClass.setOnClickListener(this)

        val result : TextView = findViewById(R.id.tv_result)
        result.text = intent.getIntExtra(EXTRA_RESULT,0).toString()
    }
    override fun onClick(v: View?){
        when (v?.id){
            R.id.btn_move_activity ->{
            val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_data -> {
                val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Ivan")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE,17)
                startActivity(moveWithDataIntent)
            }
            R.id.btn_move_activity_class -> {
                val moveWithClass = Intent(this@MainActivity, moveclass::class.java)
                startActivity(moveWithClass)
            }
            R.id.btn_dial_number -> {
                val phoneNumber = "085155225890"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
            R.id.btn_move_activity_input ->{
                val makeInput = Intent(this@MainActivity, activity_input::class.java)
                startActivity(makeInput)
            }
        }
    }
}