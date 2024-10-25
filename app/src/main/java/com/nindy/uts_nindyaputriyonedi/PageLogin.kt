package com.nindy.uts_nindyaputriyonedi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageLogin : AppCompatActivity() {
    private lateinit var txtsign : TextView
    private lateinit var btnlogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)

        txtsign = findViewById(R.id.txtlogin)
        btnlogin = findViewById(R.id.btnsignup)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txtsign.setOnClickListener(){
            val intent = Intent(this@PageLogin,PageSignUp::class.java)
            startActivity(intent)
        }
        btnlogin.setOnClickListener(){
            val intent = Intent(this@PageLogin,RecycleActivity::class.java)
            startActivity(intent)
        }
    }
}