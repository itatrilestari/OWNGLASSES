package com.example.ownglasses

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        var R_btnBack = findViewById(R.id.R_btnBack) as ImageView
        var R_login = findViewById(R.id.R_login) as TextView
        var R_btnRegister = findViewById(R.id.R_btnRegister) as Button
        var R_email = findViewById(R.id.R_email) as EditText
        var R_password = findViewById(R.id.R_password) as EditText
        var R_confirm_pass = findViewById(R.id.R_confirm_pass) as EditText
        var R_name = findViewById(R.id.R_name) as EditText

        R_btnBack.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

        R_login.setOnClickListener{
            startActivity(Intent(this, Login::class.java))
        }
        R_btnRegister.setOnClickListener {
            var email = R_email.text.toString()
            var password = R_password.text.toString()
            var confirm = R_confirm_pass.text.toString()
            var nama = R_name.text.toString()
            if(email.isEmpty() || password.isEmpty() || confirm.isEmpty() || nama.isEmpty()){
                Toast.makeText(this, "Please input your data corectly", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }else{
                startActivity(Intent(this, utama::class.java))
            }
        }
    }
}