package com.example.tycse_books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ir3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ir3);
        PDFView pdfView= findViewById(R.id.pdfviewir3);
        pdfView.fromAsset("inforetrieve.pdf").load();
    }
}