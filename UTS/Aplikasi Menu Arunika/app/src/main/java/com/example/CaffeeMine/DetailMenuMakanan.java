package com.example.CaffeeMine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailMenuMakanan extends AppCompatActivity {

    ImageView imageViewFotoMakanan;
    TextView textViewNamaMakanan, textViewDeskripsiSingkat, textViewHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu_makanan);

        imageViewFotoMakanan = findViewById(R.id.imageViewFotoMakanan);
        textViewNamaMakanan = findViewById(R.id.textViewNamaMakanan);
        textViewDeskripsiSingkat = findViewById(R.id.textViewDeskripsiSingkat);
        textViewHarga = findViewById(R.id.textViewHarga);

        getIncomingExtra();

    }

    private void getIncomingExtra() {
        if (getIntent().hasExtra("foto_makanan") && getIntent().hasExtra("nama_makanan") && getIntent().hasExtra("harga_makanan") && getIntent().hasExtra("deskripsi_makanan")) {
            String fotoMakanan = getIntent().getStringExtra("foto_makanan");
            String namaMakanan = getIntent().getStringExtra("nama_makanan");
            String DeskripsiSingkat = getIntent().getStringExtra("deskripsi_makanan");
            String Harga = getIntent().getStringExtra("harga_makanan");

            setDataActivity(fotoMakanan,namaMakanan, DeskripsiSingkat, Harga);
        }
    }

    private void setDataActivity(String fotoMakanan, String namaMakanan, String DeskripsiSingkat, String Harga){

        Glide.with(this).asBitmap().load(fotoMakanan).into(imageViewFotoMakanan);
        textViewNamaMakanan.setText(namaMakanan);
        textViewDeskripsiSingkat.setText(DeskripsiSingkat);
        textViewHarga.setText(Harga);

    }

}