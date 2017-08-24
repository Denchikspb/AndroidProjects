package com.androidprojects;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Денис on 22.07.2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private String[] array;

    static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        ViewHolder(CardView itemView) {
            super(itemView);
            cardView = itemView;
        }
    }

    Adapter(String[] array) {
        this.array = array;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        CardView v = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        TextView textView = (TextView) cardView.findViewById(R.id.text_text);
        textView.setText(array[position]);
    }

    @Override
    public int getItemCount() {
        return array.length;
    }
}
