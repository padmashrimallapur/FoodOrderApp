package com.example.foodorderapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.foodorderapp.adapters.OrdersAdapter;
import com.example.foodorderapp.databinding.ActivityOrderBinding;
import com.example.foodorderapp.models.OrdersModel;


import java.util.ArrayList;

public class OrdersActivity extends AppCompatActivity {

    ActivityOrderBinding orderSampleBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        orderSampleBinding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(orderSampleBinding.getRoot());

        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.pizza, "Veg Pizza", "4", "23411"));
        list.add(new OrdersModel(R.drawable.pizza, "Veg Pizza", "4", "23411"));
        list.add(new OrdersModel(R.drawable.pizza, "Veg Pizza", "4", "23411"));
        list.add(new OrdersModel(R.drawable.pizza, "Veg Pizza", "4", "23411"));
        list.add(new OrdersModel(R.drawable.pizza, "Veg Pizza", "4", "23411"));
        list.add(new OrdersModel(R.drawable.pizza, "Veg Pizza", "4", "23411"));
        list.add(new OrdersModel(R.drawable.pizza, "Veg Pizza", "4", "23411"));
        list.add(new OrdersModel(R.drawable.pizza, "Veg Pizza", "4", "23411"));
        list.add(new OrdersModel(R.drawable.pizza, "Veg Pizza", "4", "23411"));

        OrdersAdapter adapter = new OrdersAdapter(list, this);
        orderSampleBinding.orderRecyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayout =  new LinearLayoutManager(this);
        orderSampleBinding.orderRecyclerView.setLayoutManager(linearLayout);

    }
}
