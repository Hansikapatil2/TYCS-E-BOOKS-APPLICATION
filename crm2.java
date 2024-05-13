package com.example.tycse_books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class crm2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crm2);
        PDFView pdfView= findViewById(R.id.pdfviewcr2);
        pdfView.fromAsset("CUSTOMER RELATIONSHIP MANAGEMENT Customer Relationship Management (2002).pdf").load();
    }
}