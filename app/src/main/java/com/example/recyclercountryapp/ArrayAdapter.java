package com.example.recyclercountryapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class ArrayAdapter extends RecyclerView.Adapter<ArrayAdapter.ViewHolder> {

    String[] countryName;
    int[] flags;

    public ArrayAdapter(String[] countryName, int[] flags) {
        this.countryName = countryName;
        this.flags = flags;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from( context );
        View v = inflater.inflate( R.layout.list_item, parent, false );
        return new ViewHolder( v );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.cName.setText( countryName[position] );
        holder.cDescription.setText( "See The Description" );
        holder.imgFlag.setImageResource( flags[position] );

    }

    @Override
    public int getItemCount() {
        return countryName.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgFlag;
        public TextView cName;
        public  TextView cDescription;
        public ViewHolder(@NonNull View itemView) {
            super( itemView );
             imgFlag = itemView.findViewById( R.id.imgFlag );
             cName = itemView.findViewById( R.id.cName );
             cDescription = itemView.findViewById( R.id.cDescription );
        }
    }
}
