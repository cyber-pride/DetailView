package com.bluapp.detailview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Main3Adapter extends RecyclerView.Adapter<Main3Adapter.myViewHolder> {
    Context context;
    List<MainData> mData;

    public Main3Adapter(Context context, List<MainData> data) {
        this.context = context;
        this.mData = data;
    }
    @Override
    public Main3Adapter.myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_main3, parent, false);
        return new myViewHolder(view);
    }
    @Override
    public void onBindViewHolder(Main3Adapter.myViewHolder holder, final int position) {
        holder.logo.setImageResource(mData.get(position).getImage());
        holder.title.setText(mData.get(position).getTitle());
        holder.subtile.setText(mData.get(position).getSubTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Detail3Activity.class);
                intent.putExtra("title", mData.get(position).getTitle());
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return mData.size();
    }
    public class myViewHolder extends RecyclerView.ViewHolder {
        private ImageView logo;
        private TextView title;
        private TextView subtile;

        public myViewHolder(View itemView) {
            super(itemView);
            logo = (ImageView) itemView.findViewById(R.id.im_logo);
            title = (TextView) itemView.findViewById(R.id.tv_title);
            subtile = (TextView) itemView.findViewById(R.id.tv_subtitle);
        }
    }
}

