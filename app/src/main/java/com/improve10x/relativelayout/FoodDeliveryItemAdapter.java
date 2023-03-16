package com.improve10x.relativelayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class FoodDeliveryItemAdapter extends RecyclerView.Adapter<FoodDeliveryItemViewHolder> {
    FoodDeliveryItems[] items;

    public FoodDeliveryItemAdapter(FoodDeliveryItems[] foodDeliveryItems){
        items = foodDeliveryItems;
    }

    @NonNull
    @Override
    public FoodDeliveryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.food_delivery_item,parent,false);
        FoodDeliveryItemViewHolder viewHolder = new FoodDeliveryItemViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodDeliveryItemViewHolder holder, int position) {
        FoodDeliveryItems item = items[position];
        holder.deliveryDateTxt.setText(item.deliveryDate);
        holder.costumerNameTxt.setText(item.costumerName);
        holder.addressTxt.setText(item.deliveryAddress);
        holder.foodRatingTxt.setText(item.foodRating);
        holder.deliveryTimeTxt.setText(item.deliveryTime);
        Picasso.get().load(item.foodUrl).into(holder.foodIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
