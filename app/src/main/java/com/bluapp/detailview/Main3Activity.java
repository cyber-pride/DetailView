package com.bluapp.detailview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private Main3Adapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mRecyclerView = (RecyclerView) findViewById(R.id.grid);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        mRecyclerView.setLayoutManager(layoutManager);
      //  mRecyclerView.addItemDecoration(new SpaceGrid(3, 10, true));
        mainAdapter = new Main3Adapter(Main3Activity.this, getData());
        mRecyclerView.setAdapter(mainAdapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    public ArrayList<MainData> getData() {
        ArrayList<MainData> list = new ArrayList<MainData>();
        list.add(new MainData("Topic Header 1", R.drawable.coin_btc, "Title 1", "SubTitle 1"));
        list.add(new MainData("Topic Header 1", R.drawable.coin_dash, "Title 2", "SubTitle 2"));
        list.add(new MainData("Topic Header 2", R.drawable.coin_etc, "Title 1", "SubTitle 1"));
        list.add(new MainData("Topic Header 2", R.drawable.coin_eth, "Title 2", "SubTitle 2"));
        list.add(new MainData("Topic Header 3", R.drawable.coin_ltc, "Title 1", "SubTitle 1"));
        list.add(new MainData("Topic Header 3", R.drawable.coin_xrp, "Title 2", "SubTitle 2"));
        list.add(new MainData("Topic Header 4", R.drawable.coin_etc, "Title 1", "SubTitle 1"));
        list.add(new MainData("Topic Header 4", R.drawable.coin_eth, "Title 2", "SubTitle 2"));
        list.add(new MainData("Topic Header 5", R.drawable.coin_xrp, "Title 1", "SubTitle 1"));
        list.add(new MainData("Topic Header 5", R.drawable.coin_ltc, "Title 2", "SubTitle 2"));
        return list;
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
