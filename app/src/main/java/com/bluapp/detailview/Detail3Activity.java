package com.bluapp.detailview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

public class Detail3Activity extends AppCompatActivity {
    private TextView title;
    private TextView address;
    private TextView phone;
    private TextView details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail3);
        title = (TextView) findViewById(R.id.tv_title);
        address = (TextView) findViewById(R.id.tv_address);
        phone = (TextView) findViewById(R.id.tv_phone);
        details = (TextView) findViewById(R.id.tv_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        title.setText(intent.getStringExtra("title"));
        address.setText("1600 Amphitheatre Markway Mountain View, CA 94043");
        Linkify.addLinks(address, Linkify.MAP_ADDRESSES);
        phone.setText("+2348142528303");
        Linkify.addLinks(phone, Linkify.PHONE_NUMBERS);
        details.setText(getString(R.string.very_long_lorem_ipsum));
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
