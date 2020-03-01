package com.example.halaleat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {
    private Restaurant[] restaurants;
    public CaptionedImagesAdapter(Restaurant[] restaurants){
        this.restaurants= restaurants;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.location_card, parent,false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = cardView.findViewById(R.id.info_image);
        TextView nameView = cardView.findViewById(R.id.name);
        TextView timeView = cardView.findViewById(R.id.time);
        TextView addressView= cardView.findViewById(R.id.address);
        nameView.setText(restaurants[position].getName());
        timeView.setText(restaurants[position].getHours());
        addressView.setText(restaurants[position].getAddress());
    }

    @Override
    public int getItemCount() {
        return restaurants.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }
}
