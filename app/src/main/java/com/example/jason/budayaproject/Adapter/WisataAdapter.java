package com.example.jason.budayaproject.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jason.budayaproject.DetailPageActivity;
import com.example.jason.budayaproject.R;
import com.example.jason.budayaproject.Data.wisata;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Jason on 21/04/2018.
 */

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.WisataViewHolder> {
    public List<wisata> datas;

    public WisataAdapter(List<wisata> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    Context context;
    @Override
    public WisataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.wisata_list,parent,false);
        return new WisataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final WisataViewHolder holder, int position) {
        if(datas!=null){
            final wisata data = datas.get(position);
            holder.tv_nama.setText(data.getNama());
            Picasso.with(context).load(String.valueOf(data.getImage())).into(holder.gbr_wisata);
            holder.cv_wisata.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailPageActivity.class);
                    intent.putExtra("namawisata",data.getNama());
                    intent.putExtra("gambar",data.getImage());
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public class WisataViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama;
        ImageView gbr_wisata;
        CardView cv_wisata;

        public WisataViewHolder(View itemView) {
            super(itemView);
            tv_nama = itemView.findViewById(R.id.tv_nama_wisata);
            gbr_wisata =itemView.findViewById(R.id.gbr_wisata);
            cv_wisata = itemView.findViewById(R.id.cv_wisata);
        }
    }
}
