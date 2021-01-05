package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.foodorderapp.adapters.MainAdapter;
import com.example.foodorderapp.databinding.ActivityMainBinding;
import com.example.foodorderapp.models.MainModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> arrayList = new ArrayList<>();
        arrayList.add(new MainModel(R.drawable.pizza, "Veg Pizza", "5", "Veg Pizza with extra cheese"));
        arrayList.add(new MainModel(R.drawable.pizza, "Veg Pizza", "5", "Veg Pizza with extra cheese"));
        arrayList.add(new MainModel(R.drawable.pizza, "Veg Pizza", "5", "Veg Pizza with extra cheese"));
        arrayList.add(new MainModel(R.drawable.pizza, "Veg Pizza", "5", "Veg Pizza with extra cheese"));
        arrayList.add(new MainModel(R.drawable.pizza, "Veg Pizza", "5", "Veg Pizza with extra cheese"));
        arrayList.add(new MainModel(R.drawable.pizza, "Veg Pizza", "5", "Veg Pizza with extra cheese"));
        arrayList.add(new MainModel(R.drawable.pizza, "Veg Pizza", "5", "Veg Pizza with extra cheese"));
        arrayList.add(new MainModel(R.drawable.pizza, "Veg Pizza", "5", "Veg Pizza with extra cheese"));
        arrayList.add(new MainModel(R.drawable.pizza, "Veg Pizza", "5", "Veg Pizza with extra cheese"));

        MainAdapter mainAdapter = new MainAdapter(arrayList , this);
        binding.recyclerView.setAdapter(mainAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(linearLayoutManager);
    }
}