package com.example.submissiondicodingandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvFoods: RecyclerView
    private var list: ArrayList<Makanan> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFoods = findViewById(R.id.rv_foods)
        rvFoods.setHasFixedSize(true)

        list.addAll(FoodData.list_food)
        showRecyclerList()

        val actionBar = supportActionBar
        actionBar!!.title = "List Makanan"

    }

    private fun showRecyclerList() {
        rvFoods.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = MakananAdapter(list)
        rvFoods.adapter = listFoodAdapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    private fun setMode(selectedMode: Int){
        when (selectedMode) {
            R.id.myProfile -> {
                val tAbout = Intent(this@MainActivity,
                About::class.java)
                startActivity(tAbout)
            }
        }
    }
}