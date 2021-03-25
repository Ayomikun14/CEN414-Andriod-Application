package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;

import java.text.BreakIterator;
import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class exampleAdapter extends RecyclerView.Adapter<exampleAdapter.ViewHolder> {

    final ArrayList<exampleItem> mExampleList;
    final Context context;

    public exampleAdapter(ArrayList<exampleItem> mExampleList, Context context) {
        this.mExampleList = mExampleList;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.example_cardlayout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.TextView1.setText(mExampleList.get(position).getmText1());
        holder.TextView2.setText(mExampleList.get(position).getmText2());
        holder.TextView3.setText(mExampleList.get(position).getmText3());

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

                TextView TextView1 = itemView.findViewById(R.id.txt_state);
                TextView TextView2 = itemView.findViewById(R.id.txt_total);
                TextView TextView3 = itemView.findViewById(R.id.txt_rate);

        }


}
