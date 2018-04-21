package com.example.jason.budayaproject;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Jason on 21/04/2018.
 */

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MakananViewHolder> {
    public List<Makanan> datas;
    public Context context;

    public MakananAdapter(List<Makanan> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    @Override
    public MakananAdapter.MakananViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.makanan_list,parent,false);
        return new MakananAdapter.MakananViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MakananAdapter.MakananViewHolder holder, int position) {
        if(datas!=null){
            final Makanan data = datas.get(position);
            holder.tv_nama.setText(data.getNama());
            Picasso.with(context).load(String.valueOf(data.getImage())).into(holder.gbr_makanan);
        }
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public class MakananViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama;
        ImageView gbr_makanan;
        CardView cv_makanan;

        public MakananViewHolder(View itemView) {
            super(itemView);
            tv_nama = itemView.findViewById(R.id.tv_nama_makanan);
            gbr_makanan =itemView.findViewById(R.id.gbr_makanan);
            cv_makanan = itemView.findViewById(R.id.cv_makanan);
        }
    }
}
