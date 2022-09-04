package com.example.submissiondicodingandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DeskripsiMakanan : AppCompatActivity() {
    private lateinit var deskripsi_makanan : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_food_description)

        val actionBar = supportActionBar
        actionBar!!.title = "Detail Makanan"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val setNama: TextView = findViewById(R.id.set_foodName)
        val setDesc: TextView = findViewById(R.id.set_foodDescription)
        val setImg: ImageView = findViewById(R.id.img_food_photo)

        val nama = intent.getStringExtra(EXTRA_NAME)
        val gambar = intent.getIntExtra(EXTRA_PHOTO, 0)
        val description = intent.getStringExtra(EXTRA_DETAIL)

        setNama.text = nama
        Glide.with(this)
            .load(gambar)
            .apply(RequestOptions())
            .into(setImg)
        setDesc.text = description
        if (savedInstanceState != null){
            val detail_output = savedInstanceState.getString(DeskripsiMakanan.EXTRA_DETAIL)
            deskripsi_makanan.text = detail_output
        }
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(DeskripsiMakanan.EXTRA_DETAIL, deskripsi_makanan.text.toString())
    }
    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "photo"
        const val EXTRA_DETAIL = "extra_detail"
    }
}