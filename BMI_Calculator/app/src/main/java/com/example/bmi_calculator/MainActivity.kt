package com.example.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtBerat:EditText
    private lateinit var edtTinggi:EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView
    //    Menambahka Companion object. Target(Supaya saat layar berorientasi hasil tetap muncul dan tidak hilang)
    companion object {
        private const val STATE_RESULT = "state_result"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtBerat = findViewById(R.id.edt_berat)
        edtTinggi = findViewById(R.id.edt_tinggi)
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
            val inputBerat = edtBerat.text.toString().trim()
            val inputTinggi = edtTinggi.text.toString().trim()
            var isEmptyFields = false
//            Untuk ngecek apakah suatu field empty atau tidak dan memberi warning
            if (inputBerat.isEmpty()){
                isEmptyFields = true
                edtBerat.error = "Field ini tidak boleh kosong"
            }
            if (inputTinggi.isEmpty()){
                isEmptyFields = true
                edtTinggi.error = "Field ini tidak boleh kosong"
            }
            if (!isEmptyFields){
                val bmi = inputBerat.toDouble() / ((inputTinggi.toDouble() * inputTinggi.toDouble()) / 10000)
                tvResult.text = bmi.toString()
            }

        }
    }
}