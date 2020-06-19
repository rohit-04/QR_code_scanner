package com.example.qrcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.xml.transform.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class scanActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler{

    ZXingScannerView scannerview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        scannerview=new ZXingScannerView(this);
        setContentView(scannerview);
    }



    @Override
    public void handleResult(com.google.zxing.Result result) {
        MainActivity.tvresult.setText("Result: "+result.getText());
         onBackPressed();

    }

    @Override
    protected void onPause() {
        super.onPause();

        scannerview.stopCamera();
    }

    @Override
    protected void onResume() {
        super.onResume();

        scannerview.setResultHandler(this);
        scannerview.startCamera();
    }
}

