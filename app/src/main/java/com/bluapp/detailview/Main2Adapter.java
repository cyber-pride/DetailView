package com.bluapp.detailview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Main2Adapter extends RecyclerView.Adapter<Main2Adapter.Holder> {

    Context mContext;
    ArrayList<MainData> mArrayListString;

    public Main2Adapter(Context mContext, ArrayList<MainData> mArrayListString) {
        this.mContext = mContext;
        this.mArrayListString = mArrayListString;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_main, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, final int position) {
        holder.mimage.setImageResource(mArrayListString.get(position).getImage());
        holder.mtitle.setText(mArrayListString.get(position).getTitle());
        holder.msubtitle.setText(mArrayListString.get(position).getSubTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, Detail2Activity.class);
                intent.putExtra("title", mArrayListString.get(position).getTitle());
                intent.putExtra("subtitle", mArrayListString.get(position).getSubTitle());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mArrayListString.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        private final ImageView mimage;
        private final TextView mtitle;
        private final TextView msubtitle;

        public Holder(View itemView) {
            super(itemView);
            mimage= (ImageView) itemView.findViewById(R.id.im_logo);
            mtitle= (TextView) itemView.findViewById(R.id.tv_title);
            msubtitle= (TextView) itemView.findViewById(R.id.tv_subtitle);
        }
    }
}