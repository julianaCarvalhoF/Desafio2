package com.example.digitalhousefood.View.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.digitalhousefood.Model.CardMold
import com.example.digitalhousefood.R
import com.example.digitalhousefood.View.adapter.MenuAdapter

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val restaurantData = intent.getParcelableExtra<CardMold>("restaurantData")

        findViewById<RecyclerView>(R.id.rvMenuList).apply {
            layoutManager = GridLayoutManager(this@MenuActivity, 2)
            if (restaurantData != null) {
                adapter = MenuAdapter(restaurantData.menu)
            }

        }
        findViewById<ImageView>(R.id.ivRestaurantPhoto).apply {
            Glide.with(this@MenuActivity).load(restaurantData?.cardImage).into(this)
        }
        findViewById<TextView>(R.id.tvRestaurantName).apply {
            this.text = restaurantData?.cardName

        }
    }
}