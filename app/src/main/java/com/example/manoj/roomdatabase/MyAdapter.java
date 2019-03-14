package com.example.manoj.roomdatabase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    List<Customer> list;
    public MyAdapter(FragmentActivity activity, List<Customer> list) {
        this.context=activity;
        this.list=list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View v=LayoutInflater.from(context).inflate(R.layout.design,viewGroup,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.t1.setText(list.get(i).getUid());
        myViewHolder.t2.setText(list.get(i).getUname());
        myViewHolder.t3.setText(list.get(i).getUmail());
        myViewHolder.t4.setText(list.get(i).getUphone());
    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView t1,t2,t3,t4;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.text4);
            t2=itemView.findViewById(R.id.text5);
            t3=itemView.findViewById(R.id.text6);
            t4=itemView.findViewById(R.id.text7);

            }
    }
}
