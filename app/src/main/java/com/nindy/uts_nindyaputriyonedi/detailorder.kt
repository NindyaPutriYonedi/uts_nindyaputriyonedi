package com.nindy.uts_nindyaputriyonedi

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detailorder : AppCompatActivity() {
    private lateinit var gambar: ImageView
    private lateinit var nama: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailorder)

        gambar = findViewById(R.id.gambar)
        nama = findViewById(R.id.nama)

        val gambarResource = intent.getIntExtra("gambar", 0)
        val namaText = intent.getStringExtra("nama")

        if (gambarResource != 0) {
            gambar.setImageResource(gambarResource)
        }

        nama.text = namaText ?: "Default Name"

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}