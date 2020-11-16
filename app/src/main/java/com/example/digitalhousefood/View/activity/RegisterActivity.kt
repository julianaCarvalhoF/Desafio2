package com.example.digitalhousefood.View.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.digitalhousefood.R

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}