package com.example.emelatour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onImageClick(View view)
    {
        Log.d("MainActivity", "Image clicked");
        Intent intent = new Intent(this, PromoActivity.class);
        startActivity(intent);
    }
}
