package com.example.sis2125_lab1_yernurraimbek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button UploadButton;
    private Button DownloadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        UploadButton = findViewById(R.id.btnUpload);
        DownloadButton = findViewById(R.id.btnDownload);

        UploadButton.setOnClickListener(view ->{
            Toast.makeText(MainActivity.this, "Uploading....", Toast.LENGTH_SHORT).show();
        });
        DownloadButton.setOnClickListener(view ->{
            Toast.makeText(MainActivity.this, "Downloading....", Toast.LENGTH_SHORT).show();
        });
    }
}