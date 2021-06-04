package com.example.mlab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullScreen extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        imageView = (ImageView) findViewById(R.id.full_img);

        getSupportActionBar().hide();
        getSupportActionBar().setTitle("Full Screen Image");

        Intent i = getIntent();

        int position = i.getExtras().getInt("id");

        ImageAdapter imageAdapter = new ImageAdapter(this);

        imageView.setImageResource(imageAdapter.imageArray[position]);

    }
}