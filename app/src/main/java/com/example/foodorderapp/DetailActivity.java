package com.example.foodorderapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderapp.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int image = getIntent().getIntExtra("image", 0);
        int price = Integer.parseInt(getIntent().getStringExtra("price"));
        String foodName = getIntent().getStringExtra("foodName");
        String description = getIntent().getStringExtra("description");

        binding.detailImageId.setImageResource(image);
        binding.pricelb.setText(String.format("%d", price));
        binding.foodDeatilDescription.setText(description);
        binding.foodNameId.setText(foodName);
    }
}
