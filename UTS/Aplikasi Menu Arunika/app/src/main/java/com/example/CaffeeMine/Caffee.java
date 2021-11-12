package com.example.CaffeeMine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Caffee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caffee);
    }

    public void pindah(View view) {
        Intent intent = new Intent(Caffee.this, MainActivity.class);
        startActivity(intent);
    }

    public void pindah2(View view) {
        Intent intents = new Intent(Caffee.this, MainActivity.class);
        startActivity(intents);
    }
}