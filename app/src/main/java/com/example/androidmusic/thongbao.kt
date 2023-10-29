package com.example.androidmusic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class thongbao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thongbao)


        val btntaikhoan = findViewById<View>(R.id.taikhoan) as Button
        val btntrangchu = findViewById<View>(R.id.trangchu) as Button

        btntaikhoan.setOnClickListener {
            val intent = Intent(this@thongbao, taikhoan::class.java)
            startActivity(intent)
        }
        btntrangchu.setOnClickListener {
            val intent = Intent(this@thongbao, trangchu::class.java)
            startActivity(intent)
        }
    }
}