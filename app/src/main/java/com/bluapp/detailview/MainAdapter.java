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

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.Holder> {

    Context mContext;
    ArrayList<MainData> mArrayListString;

    public MainAdapter(Context mContext, ArrayList<MainData> mArrayListString) {
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
                switch (mArrayListString.get(position).getHeader()){
                    case "Topic Header 1":
                        if(mArrayListString.get(position).getTitle().equalsIgnoreCase("Title 1")){
                            mContext.startActivity(new Intent(mContext, Main2Activity.class));
                        }else{
                            mContext.startActivity(new Intent(mContext, Main3Activity.class));
                        }
                        break;

                        default: Intent intent = new Intent(mContext, DetailActivity.class);
                            intent.putExtra("logo", mArrayListString.get(position).getImage());
                            intent.putExtra("title", mArrayListString.get(position).getTitle());
                            mContext.startActivity(intent);
                }
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