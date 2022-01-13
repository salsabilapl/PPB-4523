package com.example.CaffeeMine;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder>{

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> deskripsiSingkat = new ArrayList<>();
    private ArrayList<String> deskripsiPanjang = new ArrayList<>();
    private ArrayList<String> harga = new ArrayList<>();
    private Context context;

    public MenuAdapter(ArrayList<String> fotoMakanan, ArrayList<String> namaMakanan, ArrayList<String> deskripsiSingkat,ArrayList<String> deskripsiPanjang, ArrayList<String> harga, Context context) {
        this.fotoMakanan = fotoMakanan;
        this.namaMakanan = namaMakanan;
        this.deskripsiSingkat = deskripsiSingkat;
        this.deskripsiPanjang = deskripsiPanjang;
        this.harga = harga;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(fotoMakanan.get(position)).into(holder.imageViewFotoMakanan);
        holder.textViewNamaMakanan.setText(namaMakanan.get(position));
        holder.textView2DeskripsiSingkat.setText(deskripsiSingkat.get(position));
        holder.textView3Harga.setText(harga.get(position));
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, namaMakanan.get(position), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, DetailMenuMakanan.class);
                intent.putExtra("foto_makanan", fotoMakanan.get(position));
                intent.putExtra("nama_makanan", namaMakanan.get(position));
                intent.putExtra("harga_makanan", harga.get(position));
                intent.putExtra("deskripsi_makanan", deskripsiPanjang.get(position));

                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return namaMakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageViewFotoMakanan;
        TextView textViewNamaMakanan;
        TextView textView2DeskripsiSingkat;
        TextView textView3Harga;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFotoMakanan = itemView.findViewById(R.id.imageViewFotoMakanan);
            textViewNamaMakanan = itemView.findViewById(R.id.textViewNamaMakanan);
            textView2DeskripsiSingkat = itemView.findViewById(R.id.textView2DeskripsiSingkat);
            textView3Harga = itemView.findViewById(R.id.textView3Harga);
            constraintLayout = itemView.findViewById(R.id.ConstraintLayout);

        }
    }
}
