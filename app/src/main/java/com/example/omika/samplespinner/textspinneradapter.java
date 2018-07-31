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

import java.util.ArrayList;

public class textspinneradapter extends ArrayAdapter {
    private  textspinneradapter(Context context, ArrayList<textspinner> textspinnerArrayList) {
        super(context, 0, textspinnerArrayList);
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
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.holder, parent, false
            );
        }

        ImageView imageViewFlag = convertView.findViewById(R.id.textimage);
        TextView textViewName = convertView.findViewById(R.id.texttext);

        textspinner currentItem = (textspinner) getItem(position);

        if (currentItem != null) {
            imageViewFlag.setImageResource(currentItem.gettextImage());
            textViewName.setText(currentItem.gettext());
        }

        return convertView;
    }
}

