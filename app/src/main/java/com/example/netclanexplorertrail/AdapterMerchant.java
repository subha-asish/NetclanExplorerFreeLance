package com.example.netclanexplorertrail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterMerchant extends RecyclerView.Adapter<AdapterMerchant.viewHolder> {

    ArrayList<profilemodel3> cloneArray = new ArrayList<>();
    Context contex;

    public AdapterMerchant(ArrayList<profilemodel3> cloneArray, Context contex) {
        this.cloneArray = cloneArray;
        this.contex = contex;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(contex).inflate(R.layout.custom_view3,parent,false);
        viewHolder holder = new viewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.profile.setImageResource(cloneArray.get(position).img);
        holder.name.setText(cloneArray.get(position).name);


    }

    @Override
    public int getItemCount() {
        return cloneArray.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView name;
        ImageView profile;
        public viewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameTextView);

            profile = itemView.findViewById(R.id.profileImageView);

        }
    }

}