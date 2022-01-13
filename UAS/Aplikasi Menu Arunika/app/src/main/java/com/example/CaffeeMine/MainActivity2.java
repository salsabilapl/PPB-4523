package com.example.CaffeeMine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> deskripsiSingkat = new ArrayList<>();
    private ArrayList<String> deskripsiPanjang = new ArrayList<>();
    private ArrayList<String> harga = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getDataFromInternet();
    }

    private void proses(){
        RecyclerView recyclerView = findViewById(R.id.Menu);
        MenuAdapter adapter = new MenuAdapter(fotoMakanan, namaMakanan, deskripsiSingkat, deskripsiPanjang, harga, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private void getDataFromInternet(){
        namaMakanan.add("Kopi Susu Gula Aren");
        harga.add("Rp8.000");
        deskripsiSingkat.add("Minuman");
        deskripsiPanjang.add("Sesuai dengan namanya, minuman ini terdiri dari kopi, susu dan gula aren. Namun, ada juga beberapa yang mencampurnya dengan perisa, seperti hazelnut, rum dan masih banyak lagi lainnya. Minuman kopi ini tersedia dalam kemasan botol maupun dalam cup plastik.");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2021/08/es-kopi-susu-gula-aren.jpg");

        namaMakanan.add("Milk Boba");
        harga.add("Rp15.000");
        deskripsiSingkat.add("Minuman");
        deskripsiPanjang.add("Tak hanya teh, semua bisa dipadukan dengan olahan tepung tapioka ini. Tekstus boba yang kenyal dan unik memang bisa membuat siapapun ketagihan. Boba bisa dipadukan dengan kopi, minuman bersoda hingga minuman dengan rasa buah. Boba ini juga sangat mudah dibuat sendiri dan bahan-bahan yang dibutuhkan pun tidak terlalu banyak.");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2021/08/minuman-boba.jpg");

        namaMakanan.add("Es Teh");
        harga.add("Rp5.000");
        deskripsiSingkat.add("Minuman");
        deskripsiPanjang.add("Gerai minuman teh kekinian ini biasanya menawarkan menu es teh dengan perisa buat atau susu. Biasanya, minuman berbahan dasar teh ini tidak menggunakan topping. Namun, justru inilah yang membuat minuman ini tetap bertahan sampai saat ini dan banyak dicari.");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2021/08/minuman-teh-kekinian.jpg");

        namaMakanan.add("Charcoal");
        harga.add("Rp15.000");
        deskripsiSingkat.add("Minuman");
        deskripsiPanjang.add("Minuman ini memiliki tampilan berwarna hitam yang mana warna hitam tersebut terbuat daru jus yang dicampur dengan activated charcoal atau arang aktif. Minuman yang dipadukan dengan charcoal ini tidak mengalami perubahan rasa yang signifikan, namun hanya warnanya saja yang berubah. Minuman charcoal banyak penggemarnya karena memiliki manfaat baik bagi kesehatan, yaitu charcoal mampu membilas racun dalam tubuh, perut kembung, diare dan berbagai masalah pencernaan lainnya." );
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2021/08/minuman-charcoal.jpg");

        namaMakanan.add("Yakult");
        harga.add("Rp10.000");
        deskripsiSingkat.add("Minuman");
        deskripsiPanjang.add("Minuman dengan campuran yakult ini menjadi populer karena rasanya yang enak dan cocok dipadukan dengan apa saja. Seperti Es Leci Yakult, Lemon Yakult, Matcha Yakult dan masih banyak lagi lainnya. Tak hanya menawarkan rasa yang segar, minuman dengan campuran yakult ini juga lebih sehat.");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2021/08/minuman-yakult.jpg");

        namaMakanan.add("Susu Regal");
        harga.add("Rp10.000");
        deskripsiSingkat.add("Minuman");
        deskripsiPanjang.add("Menggunakan Roti Regal. Minuman dengan campuran yakult ini menjadi populer karena rasanya yang enak dan cocok dipadukan dengan apa saja. Seperti Es Leci Yakult, Lemon Yakult, Matcha Yakult dan masih banyak lagi lainnya. Tak hanya menawarkan rasa yang segar, minuman dengan campuran yakult ini juga lebih sehat.");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2021/08/minuman-susu-regal.jpg");

        namaMakanan.add("Cold-Pressed Juice");
        harga.add("Rp18.000");
        deskripsiSingkat.add("Minuman");
        deskripsiPanjang.add("");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2021/08/cold-pressed-juice.jpeg");



        proses();
    }
    public void pindah3(View view) {
        Intent intents = new Intent(MainActivity2.this, Pesan.class);
        startActivity(intents);
    }
}