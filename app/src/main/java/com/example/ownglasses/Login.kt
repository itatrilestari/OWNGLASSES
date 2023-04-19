package com.example.ownglasses

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        var L_btnBack = findViewById(R.id.L_btnBack) as ImageView
        var L_btnLogin = findViewById(R.id.L_btnLogin) as Button
        var L_register = findViewById(R.id.L_register) as TextView
        var L_email = findViewById(R.id.L_email) as EditText
        var L_password = findViewById(R.id.L_password) as EditText

        L_btnBack.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

        L_btnLogin.setOnClickListener {
            val email = L_email.text.toString()
            val password = L_password.text.toString()
            if(email.isEmpty()||password.isEmpty()){
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if(email == "admin@gmail.com" || password == "admin"){
                startActivity(Intent(this, utama::class.java))
            }
        }

        L_register.setOnClickListener{
            startActivity(Intent(this, Register::class.java))
        }
    }
}