package com.example.tampillistview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    BantuDataBase bd;
    public static ListView listView;
    public static EditText editText;
    Button tblTambah;

    ArrayAdapter adapter;
    ArrayList<String> listviewku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listdatabuah);
        editText = findViewById(R.id.editdatabuah);
        tblTambah = findViewById(R.id.tbltambah);
        bd = new BantuDataBase(this);

        listviewku = new ArrayList<>();
        tampilkan_buah();
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                final String noid=listviewku.get(position);
                final String nomor=noid.substring(0,2);
                //editText.setText(nomor.toString());
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Perhatian")
                        .setMessage("Yakin Menghapus Data Ini?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                bd.hapusRecord(Integer.parseInt(nomor));
                                listviewku.remove(position);
                                listView.invalidateViews();
                            }
                        })
                        .setNegativeButton("No",null)
                        .show();
                return false;
            }
        });

        tblTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd.tambahData(editText.getText().toString());
                Toast.makeText(MainActivity.this,"Data Tersimpan",Toast.LENGTH_SHORT).show();
                listviewku.clear();
                tampilkan_buah();
            }
        });

    }

    private void tampilkan_buah() {
        Cursor cursor=bd.tampilBuah();
        if(cursor.getCount()==0){
            Toast.makeText(this, "Record kosong coy", Toast.LENGTH_SHORT).show();
        }else{
            while(cursor.moveToNext()){
                listviewku.add(String.valueOf(cursor.getInt(0))+" "+cursor.getString(1));
            }
            adapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,listviewku);
            listView.setAdapter(adapter);
        }
    }
}
