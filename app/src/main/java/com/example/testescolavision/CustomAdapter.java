package com.example.testescolavision;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<ItemData> dataList;

    public CustomAdapter(List<ItemData> dataList) {
        this.dataList = dataList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView variableTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            variableTextView = itemView.findViewById(R.id.variableTextView);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ItemData item = dataList.get(position);
        holder.variableTextView.setText(String.valueOf(item.getVariable()));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}

