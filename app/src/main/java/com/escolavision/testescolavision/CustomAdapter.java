package com.escolavision.testescolavision;

/*
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<Integer> dataList;

    public CustomAdapter(List<Integer> dataList) {
        this.dataList = dataList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView variableTextView;

        @SuppressLint("WrongViewCast")
        public ViewHolder(View itemView) {
            super(itemView);
            variableTextView = itemView.findViewById(R.id.recyclerView);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.resultados, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Integer item = dataList.get(position);
        holder.variableTextView.setText(String.valueOf(item));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
*/