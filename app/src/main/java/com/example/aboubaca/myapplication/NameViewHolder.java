package com.example.aboubaca.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NameViewHolder extends RecyclerView.ViewHolder {

    private TextView textViewName;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);

        textViewName = itemView.findViewById(R.id.item_name_textview);
    }

    public void setContent(String name){
        textViewName.setText(name);
    }
}
