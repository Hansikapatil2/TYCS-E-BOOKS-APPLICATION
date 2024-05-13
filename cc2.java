package com.example.tycse_books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cc2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc2);
        PDFView pdfView= findViewById(R.id.cpdfview2);
        pdfView.fromAsset("Cloud_Computing_Technol.pdf").load();
    }
}