package com.example.tycse_books;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;


public class ds1 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds1);

        PDFView pdfView= findViewById(R.id.pdfview);
        pdfView.fromAsset("data scien1.pdf").load();




    }
}