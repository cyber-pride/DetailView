package com.bluapp.detailview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainAdapter = new MainAdapter(this,getData());
        mRecyclerView.setAdapter(mainAdapter);

        RecyclerSectionItemDecoration sectionItemDecoration = new RecyclerSectionItemDecoration(getResources().getDimensionPixelSize(R.dimen.header), true, getSectionCallback(getData()));
        mRecyclerView.addItemDecoration(sectionItemDecoration);
    }


    public ArrayList<MainData> getData() {
        ArrayList<MainData> list = new ArrayList<MainData>();
        //Header one
        list.add(new MainData("Topic Header 1", R.drawable.coin_btc, "Title 1", "SubTitle 1"));
        list.add(new MainData("Topic Header 1", R.drawable.coin_dash, "Title 2", "SubTitle 2"));
        list.add(new MainData("Topic Header 1", R.drawable.coin_btc, "Title 3", "SubTitle 3"));
        list.add(new MainData("Topic Header 1", R.drawable.coin_dash, "Title 4", "SubTitle 4"));
        list.add(new MainData("Topic Header 1", R.drawable.coin_dash, "Title 5", "SubTitle 5"));

        //Header two
        list.add(new MainData("Topic Header 2", R.drawable.coin_etc, "Title 1", "SubTitle 1"));
        list.add(new MainData("Topic Header 2", R.drawable.coin_eth, "Title 2", "SubTitle 2"));

        //Header three
        list.add(new MainData("Topic Header 3", R.drawable.coin_ltc, "Title 1", "SubTitle 1"));
        list.add(new MainData("Topic Header 3", R.drawable.coin_xrp, "Title 2", "SubTitle 2"));

        ////Header four
        list.add(new MainData("Topic Header 4", R.drawable.coin_etc, "Title 1", "SubTitle 1"));
        list.add(new MainData("Topic Header 4", R.drawable.coin_eth, "Title 2", "SubTitle 2"));

        //Header five
        list.add(new MainData("Topic Header 5", R.drawable.coin_xrp, "Title 1", "SubTitle 1"));
        list.add(new MainData("Topic Header 5", R.drawable.coin_ltc, "Title 2", "SubTitle 2"));
        return list;
    }
    private RecyclerSectionItemDecoration.SectionCallback getSectionCallback(final List<MainData> people) {
        return new RecyclerSectionItemDecoration.SectionCallback() {
            @Override
            public boolean isSection(int position) {
                return position == 0 || people.get(position).getHeader() != people.get(position - 1).getHeader();
            }

            @Override
            public CharSequence getSectionHeader(int position) {
                return people.get(position).getHeader();
            }
        };
    }
}
