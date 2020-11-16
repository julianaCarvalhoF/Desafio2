package com.example.digitalhousefood.View.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.digitalhousefood.Model.GridLayoutMold
import com.example.digitalhousefood.R

class GridActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        supportActionBar?.title = "Digital House Foods"

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val gridData = intent.getParcelableExtra<GridLayoutMold>("gridData")

        findViewById<ImageView>(R.id.ivimgGrid).apply {
            Glide.with(this).load(gridData?.imgGrid).into(this)
        }
        findViewById<TextView>(R.id.tvnameGrid).apply{
            this.text = gridData?.nameGrid
        }
        findViewById<TextView>(R.id.tvExplanation).apply{
            this.text = gridData?.explanation
        }
    }

    }