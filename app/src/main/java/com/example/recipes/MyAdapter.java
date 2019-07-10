package com.example.recipes;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    Context context;
    ArrayList<Recipes> recipes;

    public MyAdapter(Context context, ArrayList<Recipes> recipes) {
        this.context = context;
        this.recipes = recipes;
    }

    @Override
    public int getCount() {
        return this.recipes.size();
    }

    @Override
    public Object getItem(int i) {
        return recipes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return recipes.indexOf(getItem(i));
    }

    @Override
    public View getView(int i, View newview, ViewGroup viewGroup) {
        if(newview == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            newview = inflater.inflate(R.layout.list_item, null);
        }

        TextView txtVw_title = (TextView) newview.findViewById(R.id.txt_title);
        TextView txtVw_description = (TextView) newview.findViewById(R.id.txt_desc);
        TextView txtVw_fulldescription = (TextView) newview.findViewById(R.id.full_desc);
        ImageView image = (ImageView) newview.findViewById(R.id.img);


        txtVw_title.setText(recipes.get(i).getTitle());
        txtVw_description.setText(recipes.get(i).getDescription());
        txtVw_fulldescription.setText(recipes.get(i).getDescription());
        image.setImageResource(recipes.get(i).getImageid());
        return newview;

    }
}
