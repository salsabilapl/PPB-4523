package com.example.aplikasitoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView angkacounter;
    int angka=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angkacounter = findViewById(R.id.kounter);
    }

    public void toastklik(View view) {
        Toast.makeText(this, "INI ADALAH TOAST", Toast.LENGTH_LONG).show();

    }

    public void tb1kounter(View view) {
        angka=angka+1;
        angkacounter.setText(Integer.toString(angka));
    }
}