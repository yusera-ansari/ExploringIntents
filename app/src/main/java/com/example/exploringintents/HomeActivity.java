package com.example.exploringintents;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class HomeActivity extends AppCompatActivity {
MaterialButton btnGoToCatalog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    btnGoToCatalog= findViewById(R.id.btn_go_to_catalog);
    btnGoToCatalog.setOnClickListener((view)->{
        Intent intent = new Intent(this, CatalogActivity.class);
        startActivity(intent);
    });
    }
}