package com.example.tycse_books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class crm1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crm1);
        PDFView pdfView= findViewById(R.id.pdfviewcr1);
        pdfView.fromAsset("crm1.pdf").load();
    }
}