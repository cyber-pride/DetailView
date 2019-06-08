package com.bluapp.detailview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    private TextView tandc;
    private Button enterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        tandc = (TextView) findViewById(R.id.tandc);
        enterBtn = (Button) findViewById(R.id.enterBtn);
        tandc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.inducesmilwe.com")));
            }
        });
        enterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
            }
        });
    }
}
