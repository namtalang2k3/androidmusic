package com.example.androidmusic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class dangnhap : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dangnhap)

        val btndangnhap: Button = findViewById(R.id.btndangnhap)


        btndangnhap.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@dangnhap, trangchu::class.java)
            startActivity(intent)
        })
    }
}