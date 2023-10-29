package com.example.androidmusic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class taikhoan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taikhoan)

        val btnthongbao = findViewById<View>(R.id.thongbao)
        val btntrangchu = findViewById<View>(R.id.trangchu) as Button

        btnthongbao.setOnClickListener {
            val intent = Intent(this@taikhoan, thongbao::class.java)
            startActivity(intent)
        }
        btntrangchu.setOnClickListener {
            val intent = Intent(this@taikhoan, trangchu::class.java)
            startActivity(intent)
        }
    }
    }