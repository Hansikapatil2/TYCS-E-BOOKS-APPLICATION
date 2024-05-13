package com.example.tycse_books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class eh1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eh1);
        PDFView pdfView= findViewById(R.id.pdfvieweh);
        pdfView.fromAsset("ethical hacking.pdf").load();
    }
}