package com.example.omika.samplespinner;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class textspinneradapter extends ArrayAdapter {

    Context context;

    ArrayList<textspinner>textspinners;


    public   textspinneradapter(Context context, ArrayList<textspinner> textspinnerArrayList) {
        super(context,0, textspinnerArrayList);
        this.context=context;
        this.textspinners=textspinnerArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        return initView(position, convertView, parent);
    }



    private View initView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.holder, parent, false
        );


        ImageView imageViewFlag = convertView.findViewById(R.id.textimage);
        TextView textViewName = convertView.findViewById(R.id.texttext);

        Glide.with(context).load(textspinners.get(position).gettextImage()).into(imageViewFlag);






        textViewName.setText(textspinners.get(position).gettext());


        return convertView;
    }
}

