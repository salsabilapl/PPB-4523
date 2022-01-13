package com.example.CaffeeMine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.net.URL;

public class DetailCaffee extends AppCompatActivity {
    ImageView ImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_caffee);

        ImageView img = (ImageView)findViewById(R.id.imageView5);
        img.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.google.com"));
                startActivity(intent);
            }
        });
        ImageView imgg = (ImageView)findViewById(R.id.imageView6);
        img.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.google.com"));
                startActivity(intent);
            }
        });
        ImageView imggg = (ImageView)findViewById(R.id.imageView7);
        img.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.google.com/maps/place/Arunika+Bistro/@-6.9263709,107.594872,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e7b10a27a685:0x4e2fd03e6ffcacda!8m2!3d-6.9263709!4d107.5970607"));
                startActivity(intent);
            }
        });
    }
}