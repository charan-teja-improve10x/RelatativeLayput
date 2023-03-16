package com.improve10x.relativelayout;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodDeliveryItemViewHolder extends RecyclerView.ViewHolder {
    TextView deliveryDateTxt;
    TextView costumerNameTxt;
    TextView addressTxt;
    TextView foodRatingTxt;
    TextView deliveryTimeTxt;
    ImageView foodIv;
    public FoodDeliveryItemViewHolder(@NonNull View itemView) {
        super(itemView);
        deliveryDateTxt = itemView.findViewById(R.id.delivery_date_txt);
        costumerNameTxt = itemView.findViewById(R.id.costmer_name_txt);
        addressTxt = itemView.findViewById(R.id.address_txt);
        foodRatingTxt = itemView.findViewById(R.id.food_rating_txt);
        deliveryTimeTxt = itemView.findViewById(R.id.delivery_time_txt);
        foodIv = itemView.findViewById(R.id.food_iv);
    }
}
