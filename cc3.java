package com.example.tycse_books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cc3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc3);
        PDFView pdfView= findViewById(R.id.cpdfview3);
        pdfView.fromAsset("cloud_Web_Services.pdf").load();
    }
}