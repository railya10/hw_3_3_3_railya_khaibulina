package com.example.hw_3_3_3_railya_khaibulina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        ArrayList<String> addresses = new ArrayList<>();
        addresses.add("Main street");
        addresses.add("Second street");
        addresses.add("Spring street");
        addresses.add("Summer street");
        addresses.add("Winter street");
        addresses.add("Fifth street");
        addresses.add("Washington street");
        addresses.add("Boston street");
        addresses.add("Stream street");
        addresses.add("Lychee street");
        addresses.add("Pineapple street");
        addresses.add("Apple street");
        addresses.add("Pear street");
        addresses.add("Watermelon street");
        addresses.add("Graffiti street");
        addresses.add("Sour street");
        addresses.add("Soviet street");
        addresses.add("General street");

        AddressAdapter adapter = new AddressAdapter(addresses);
        recyclerView.setAdapter(adapter);

    }
}