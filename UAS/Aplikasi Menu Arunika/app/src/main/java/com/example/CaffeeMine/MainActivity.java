package com.example.CaffeeMine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> deskripsiSingkat = new ArrayList<>();
    private ArrayList<String> deskripsiPanjang = new ArrayList<>();
    private ArrayList<String> harga = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void proses(){
        RecyclerView recyclerView = findViewById(R.id.Menu);
        MenuAdapter adapter = new MenuAdapter(fotoMakanan, namaMakanan, deskripsiSingkat, deskripsiPanjang, harga, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private void getDataFromInternet(){
        namaMakanan.add("Dimsum");
        harga.add("Rp5.000");
        deskripsiSingkat.add("Jajanan, Chinese");
        deskripsiPanjang.add("Dimsum adalah istilah dari bahasa Kantonis dan artinya adalah makanan kecil. Biasanya dim sum dimakan sebagai sarapan atau sarsi.Dimsum kini juga dinikmati sebagai menu utama dalam sesi makan. Hidangan dim sum terdiri dari beberapa jenis makanan, di antaranya bakpao, fung zau atau ceker ayam, siomay, dumpling atau pangsit goreng, hakau yang berisi udang, gyoza atau pangsit kukus, dan xiaolongbao yaitu pangsit yang di dalamnya terdapat kuah. Mengkonsumsi dimsum saat ini juga dapat membuat perut kenyang sama seperti makanan utama lainnya.");
        fotoMakanan.add("https://static.wixstatic.com/media/217a4e_fe89f277e9c84ff78cbd05658bd852e5~mv2.jpg/v1/fill/w_768,h_511,al_c,lg_1,q_90/217a4e_fe89f277e9c84ff78cbd05658bd852e5~mv2.webp");

        namaMakanan.add("Toast and sandwich");
        harga.add("Rp15.000");
        deskripsiSingkat.add("Jajanan, Barat");
        deskripsiPanjang.add("Roti lapis roti panggang adalah roti lapis yang dibuat dengan dua potong roti di mana isinya adalah sepotong tipis roti panggang, yang mungkin banyak diolesi mentega. ");
        fotoMakanan.add("https://static.wixstatic.com/media/217a4e_6aa2e5e83972470f946445c91b4b9216~mv2.jpg/v1/fill/w_768,h_511,al_c,lg_1,q_90/217a4e_6aa2e5e83972470f946445c91b4b9216~mv2.webp");

        namaMakanan.add("Dessert Box");
        harga.add("Rp20.000");
        deskripsiSingkat.add("Sweets, Barat");
        deskripsiPanjang.add("Dessert Box merupakan makanan penutup sejenis cake super lembut yang ada di dalam kotak makanan yang transparan. Berbeda dengan dessert biasa yang disajikan di piring, dessert box bisa langsung dimakan dari tempatnya. Makanan penutup yang ditata dalam kotak bening ini biasanya terdiri dari beberapa lapisan seperti kue sponge, krim lembut, dan beragam topping lainnya. Cara makan dessert box ini juga sangat praktis sehingga bisa dibawa kemana-mana, karena tinggal disendok dan dinikmati.");
        fotoMakanan.add("data:image/jpeg;base64,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");

        namaMakanan.add("Rice Bowl");
        harga.add("Rp25.000");
        deskripsiSingkat.add("Nasi, Jepang");
        deskripsiPanjang.add("Rice Bowl atau Donburi adalah makanan Jepang berupa nasi putih dengan berbagai macam lauk di atasnya seperti ikan, daging dan sayur-sayuran berkuah yang dihidangkan di dalam mangkuk besar yang juga disebut donburi. Kuah untuk donburi bergantung pada jenis makanan, tetapi pada umumnya berupa dashi dicampur kecap asin dan mirin. ");
        fotoMakanan.add("https://blogunik.com/wp-content/uploads/2021/03/Rice-bowl.jpg");

        namaMakanan.add("Cheese Ball");
        harga.add("Rp15.000");
        deskripsiSingkat.add("Jajanan, Barat");
        deskripsiPanjang.add("Buat kamu para pecinta keju, maka jangan ketinggalan untuk dapat merasakan nikmatnya cheese ball yang menjadi salah satu makanan kekinian 2021 yang saat ini tengah digemari banyak orang. Seperti namanya, makanan ini merupakan bola-bola keju yang memiliki tekstur garing di luar dan meleleh didalam. Keju yang digunakan biasanya adalah keju mozarella yang ketika digoreng akan lumer.");
        fotoMakanan.add("https://blogunik.com/wp-content/uploads/2021/03/Cheese-ball.jpg");

        namaMakanan.add("Bakso Lobster");
        harga.add("Rp30.000");
        deskripsiSingkat.add("Jajanan, Indonesia");
        deskripsiPanjang.add("Bakso lobster merupakan bakso yang sempat viral beberapa waktu lalu. Makanan ini memadukan kenyal gurihnya adonan bakso sapi dengan lobster utuh sebagai isiannya. ");
        fotoMakanan.add("https://blogunik.com/wp-content/uploads/2021/03/Bakso-lobster.jpg");

        namaMakanan.add("Croffle");
        harga.add("Rp18.000");
        deskripsiSingkat.add("Jajanan, Barat");
        deskripsiPanjang.add("Croffle adalah hidangan yang terbuat dari adonan croissant yang dipanggang menggunakan cetakan waffle. Biasanya croffle disajikan dengan topping whipped cream dan madu. Namun di kini kamu bisa menemukan croffle dengan beragam topping.");
        fotoMakanan.add("https://blogunik.com/wp-content/uploads/2021/03/Croffle.jpg");



        proses();
    }
    public void pindah3(View view) {
        Intent intents = new Intent(MainActivity.this, Pesan.class);
        startActivity(intents);
    }
}