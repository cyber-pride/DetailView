package com.bluapp.detailview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Detail2Activity extends AppCompatActivity {
    private TextView title;
    private TextView subtitle;
    private TextView details;
    private Button vmBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);
        title = (TextView) findViewById(R.id.tv_title);
        subtitle = (TextView) findViewById(R.id.tv_subtitle);
        details = (TextView) findViewById(R.id.tv_details);
        vmBtn = (Button) findViewById(R.id.vmBtn);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        title.setText(intent.getStringExtra("title"));
        subtitle.setText(intent.getStringExtra("subtitle"));
        details.setText(getString(R.string.very_long_lorem_ipsum));
        Linkify.addLinks(details, Linkify.WEB_URLS);
        vmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.inducesmilwe.com")));
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
