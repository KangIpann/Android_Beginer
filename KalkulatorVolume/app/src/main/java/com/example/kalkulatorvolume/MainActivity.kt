package com.example.kalkulatorvolume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtWidth:EditText
    private lateinit var edtHeight:EditText
    private lateinit var edtLength:EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView
//    Menambahka Companion object. Target(Supaya saat layar berorientasi hasil tetap muncul dan tidak hilang)
    companion object {
        private const val STATE_RESULT = "state_result"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtWidth = findViewById(R.id.edt_width)
        edtHeight = findViewById(R.id.edt_height)
        edtLength = findViewById(R.id.edt_length)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)

        btnCalculate.setOnClickListener(this)
//    Menambahkan Percabangan. Target(Supaya saat layar berorientasi hasil tetap muncul dan tidak hilang)
        if (savedInstanceState != null){
            val result = savedInstanceState.getString(STATE_RESULT)
            tvResult.text = result
        }
    }
    //    Menambahkan onSaveInstanceState. Target(Supaya saat layar berorientasi hasil tetap muncul dan tidak hilang)
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, tvResult.text.toString())
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate) {
            val inputLength = edtLength.text.toString().trim()
            val inputWidth = edtWidth.text.toString().trim()
            val inputHeight = edtHeight.text.toString().trim()
            var isEmptyFields = false
//            Untuk ngecek apakah suatu field empty atau tidak dan memberi warning
            if (inputLength.isEmpty()){
                isEmptyFields = true
                edtLength.error = "Field ini tidak boleh kosong"
            }
            if (inputHeight.isEmpty()){
                isEmptyFields = true
                edtHeight.error = "Field ini tidak boleh kosong"
            }
            if (inputWidth.isEmpty()){
                isEmptyFields = true
                edtWidth.error = "Field ini tidak boleh kosong"
            }
            if (!isEmptyFields){
                val volume = inputLength.toDouble() * inputWidth.toDouble() * inputHeight.toDouble()
                tvResult.text = volume.toString()
            }

        }
    }
}