package com.example.halaleat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void phillyClick(View view) {
        Intent myIntent = new Intent(this, RestaurantCategoryActivity.class);
        myIntent.putExtra("CITY_NAME", "Philadelphia");
        startActivity(myIntent);
    }

    public void newyorkClick(View view) {
        Intent myIntent = new Intent(this, RestaurantCategoryActivity.class);
        myIntent.putExtra("CITY_NAME", "New York");
        startActivity(myIntent);
    }

    public void washingtonClick(View view) {
        Intent myIntent = new Intent(this, RestaurantCategoryActivity.class);
        myIntent.putExtra("CITY_NAME", "Washington DC");
        startActivity(myIntent);
    }
}
