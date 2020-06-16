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

    public void onCartagenaImageClick(View view)
    {
        Log.d("MainActivity", "Image clicked");
        Intent intent = new Intent(this, CartagenaActivity.class);
        startActivity(intent);
    }

    public void onCancunImageClick(View view)
    {
        Log.d("MainActivity", "Image clicked");
        Intent intent = new Intent(this, CancunActivity.class);
        startActivity(intent);
    }

    public void onMexicoCityImageClick(View view)
    {
        Log.d("MainActivity", "Image clicked");
        Intent intent = new Intent(this, MexicoCityActivity.class);
        startActivity(intent);
    }
}
