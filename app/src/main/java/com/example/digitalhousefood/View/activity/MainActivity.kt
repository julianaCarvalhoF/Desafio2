package com.example.digitalhousefood.View.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.digitalhousefood.R

class MainActivity : AppCompatActivity() {
    private var emailCheck = false
    private var passwordCheck = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val button1 = findViewById<Button>(R.id.bt_register)
        button1.setOnClickListener{
            val intent = Intent(this, RegisterActivity ::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.bt_login)
        button2.setOnClickListener{
            val intent = Intent(this, CardActivity ::class.java)
            startActivity(intent)
        }

    }


}