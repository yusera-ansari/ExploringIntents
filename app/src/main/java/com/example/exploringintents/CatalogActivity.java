package com.example.exploringintents;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

import java.net.URI;

public class CatalogActivity extends AppCompatActivity {
MaterialButton btnShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
        btnShare=findViewById(R.id.btn_share);
        btnShare.setOnClickListener((view)->{
            Intent share = new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            share.putExtra(Intent.EXTRA_TEXT, "THis is a message");
           if(share.resolveActivity(getPackageManager())!=null){
               //startActivity(share) //without-chooser
               startActivity(Intent.createChooser(share, "share via"));
           }

        });
    }
}