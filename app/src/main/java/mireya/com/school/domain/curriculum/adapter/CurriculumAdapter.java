package mireya.com.school.domain.curriculum.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import mireya.com.school.R;
import mireya.com.school.domain.curriculum.data.CurriculumData;

public class CurriculumAdapter extends RecyclerView.Adapter<CurriculumAdapter.ViewHolder> {
    private Context context;
    private List<CurriculumData> teacherData;

    public CurriculumAdapter(Context context, List<CurriculumData> teacherData) {
        this.context = context;
        this.teacherData = teacherData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_curriculum, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.subject.setText(teacherData.get(position).getSubject());
        holder.year.setText(teacherData.get(position).getYear());
    }

    @Override
    public int getItemCount() {
        return teacherData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView subject, year;
        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            subject = itemView.findViewById(R.id.tvSubject);
            year = itemView.findViewById(R.id.tvYear);

        }
    }
}
