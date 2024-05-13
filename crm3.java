package com.example.tycse_books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class crm3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crm3);
        PDFView pdfView= findViewById(R.id.pdfviewcr3);
        pdfView.fromAsset("2018_Book_CustomerRelationshipManagement.pdf").load();
    }
}