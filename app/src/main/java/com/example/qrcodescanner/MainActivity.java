package com.example.qrcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btscan;
   public static TextView tvresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btscan=findViewById(R.id.btscan);
        tvresult=findViewById(R.id.tvresult);

        btscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  ljintent =new Intent(MainActivity.this,scanActivity.class);
                startActivity(ljintent);
            }
        });
    }
}
