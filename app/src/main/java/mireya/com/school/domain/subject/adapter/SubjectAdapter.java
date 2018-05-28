package mireya.com.school.domain.subject.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import mireya.com.school.R;
import mireya.com.school.domain.subject.data.SubjectData;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.ViewHolder> {
    private List<SubjectData> teacherData;

    public SubjectAdapter(List<SubjectData> teacherData) {
        this.teacherData = teacherData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_teacher, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        /*holder.nombre.setText("hola");
        holder.especialidad.setText("que hay ");*/
        holder.nombre.setText(teacherData.get(position).getNombre());
        holder.especialidad.setText(teacherData.get(position).getEspecialidad());
    }

    @Override
    public int getItemCount() {
        return teacherData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView nombre, especialidad;
        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            nombre = itemView.findViewById(R.id.tvName);
            especialidad = itemView.findViewById(R.id.tvEspecialidad);

        }
    }
}
