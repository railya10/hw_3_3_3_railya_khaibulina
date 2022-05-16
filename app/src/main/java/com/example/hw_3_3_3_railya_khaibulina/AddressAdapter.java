package com.example.hw_3_3_3_railya_khaibulina;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AddressAdapter extends RecyclerView.Adapter <AddressViewHolder> {
    private ArrayList <String> addresses = new ArrayList<>();

    public AddressAdapter(ArrayList<String> addresses) {
        this.addresses = addresses;

    }

    @NonNull
    @Override
    public AddressViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AddressViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_address,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AddressViewHolder holder, int position) {
        holder.bind(addresses.get(position));

    }

    @Override
    public int getItemCount() {
        return addresses.size();
    }
}
