package mireya.com.school.domain.ratings.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import mireya.com.school.R;
import mireya.com.school.domain.ratings.data.RatingsData;

public class RatingsAdapter extends RecyclerView.Adapter<RatingsAdapter.ViewHolder> {
    private List<RatingsData> teacherData;

    public RatingsAdapter(List<RatingsData> teacherData) {
        this.teacherData = teacherData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ratings, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.rating.setText(teacherData.get(position).getMateria());
        holder.partial.setText(teacherData.get(position).getParcial());
    }

    @Override
    public int getItemCount() {
        return teacherData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView rating, partial;
        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            rating = itemView.findViewById(R.id.rating);
            partial = itemView.findViewById(R.id.parcial);

        }
    }
}

