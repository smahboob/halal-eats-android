package com.example.halaleat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RestaurantCategoryActivity extends AppCompatActivity {
    String city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_category);
        city = getIntent().getStringExtra("CITY_NAME");
        RecyclerView restaurantRecycler = findViewById(R.id.recycler);
        if(city.equals("Philadelphia")){
            CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(Restaurant.philidelphiaRestaurant);
            restaurantRecycler.setAdapter(adapter);
            restaurantRecycler.setLayoutManager(new LinearLayoutManager(this));
        }else if(city.equals("New York")){
            CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(Restaurant.newyorkRestaurant);
            restaurantRecycler.setAdapter(adapter);
            restaurantRecycler.setLayoutManager(new LinearLayoutManager(this));
        }else if(city.equals("Washington DC")){
            CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(Restaurant.washingtonRestaurant);
            restaurantRecycler.setAdapter(adapter);
            restaurantRecycler.setLayoutManager(new LinearLayoutManager(this));
        }

    }

    public void restaurantClick(View view) {
        Intent myIntent = new Intent(this, MapsActivity.class);
        myIntent.putExtra("RESTAURANT_NAME", ((TextView)view.findViewById(R.id.name)).getText());
        startActivity(myIntent);
    }
}
