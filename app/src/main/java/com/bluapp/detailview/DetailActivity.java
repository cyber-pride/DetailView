package com.bluapp.detailview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private ImageView logo;
    private TextView title;
    private TextView details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        logo = (ImageView) findViewById(R.id.im_logo);
        title = (TextView) findViewById(R.id.tv_title);
        details = (TextView) findViewById(R.id.tv_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        logo.setImageResource(intent.getIntExtra("logo", 0));
        title.setText(intent.getStringExtra("title"));
        details.setText(getString(R.string.very_long_lorem_ipsum));
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
