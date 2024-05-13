package com.example.tycse_books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ds3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds3);
        PDFView pdfView= findViewById(R.id.pdfview3);
        pdfView.fromAsset("data science3.pdf").load();
    }
}