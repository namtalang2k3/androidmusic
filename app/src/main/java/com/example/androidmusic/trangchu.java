package com.example.androidmusic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class trangchu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle save){
        super.onCreate(save);
        setContentView(R.layout.activity_trangchu);

        Button btnthongbao  = (Button) findViewById(R.id.thongbao);
        Button btntaikhoan  = (Button) findViewById(R.id.taikhoan);


        btnthongbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trangchu.this , thongbao.class);
                startActivity(intent);
            }
        }) ;

        btntaikhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trangchu.this , taikhoan.class);
                startActivity(intent);
            }
        }) ;



    }





}