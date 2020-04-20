package com.example.myapplication;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder> {
    ArrayList<TestClass> testClasses;

    public TestAdapter(ArrayList<TestClass> tc) {
        testClasses = tc;
    }

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new TestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {
        holder.img.setImageResource(testClasses.get(position).getImage());
        holder.text.setText(testClasses.get(position).getText());
        if (position % 2 == 1) holder.layout.setBackgroundColor(Color.parseColor("#cccccc"));
        else holder.layout.setBackgroundColor(Color.parseColor("#ffffff"));
    }

    @Override
    public int getItemCount() {
        return testClasses.size();
    }

    public class TestViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView text;
        LinearLayout layout;
        public TestViewHolder (View view) {
            super(view);
            img = (ImageView) view.findViewById(R.id.img);
            text = (TextView) view.findViewById(R.id.text);
            layout = view.findViewById(R.id.linearLayout);
        }
    }
}
