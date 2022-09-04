package com.example.submissiondicodingandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class About : AppCompatActivity() {
    companion object {
        private const val NAME_OUTPUT = "Nama"
        private const val EMAIL_OUTPUT = "Email"
    }
    private lateinit var myname : TextView
    private lateinit var myemail : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val actionbar = supportActionBar
        actionbar!!.title = "About Me"
        actionbar.setDisplayHomeAsUpEnabled(true)

        if (savedInstanceState != null){
            val name_output = savedInstanceState.getString(NAME_OUTPUT)
            val email_output = savedInstanceState.getString(EMAIL_OUTPUT)
            myname.text = name_output
            myemail.text = email_output
        }
        val myPhoto : ImageView = findViewById(R.id.about_photo)
        val img = R.drawable.ivan

        Glide.with(this)
            .load(img)
            .apply(RequestOptions())
            .into(myPhoto)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(NAME_OUTPUT, myname.text.toString())
        outState.putString(EMAIL_OUTPUT, myemail.text.toString())
    }
}