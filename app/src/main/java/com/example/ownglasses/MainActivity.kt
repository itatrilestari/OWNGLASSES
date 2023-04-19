package com.example.ownglasses

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        var btn_login = findViewById(R.id.btn_login) as Button
        var btn_register = findViewById(R.id.btn_register) as Button

        btn_login.setOnClickListener{
            startActivity(Intent(this, Login::class.java))
        }

        btn_register.setOnClickListener{
            startActivity(Intent(this, Register::class.java))
        }
    }

}