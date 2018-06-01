package mireya.com.school.domain.chat.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import mireya.com.school.R;
import mireya.com.school.domain.chat.data.ChatData;
import mireya.com.school.domain.chat.presenter.ChatPresenter;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {
    private Context context;
    private ChatPresenter presenter;
    private List<ChatData> teacherData;

    public ChatAdapter(Context context, ChatPresenter presenter, List<ChatData> teacherData) {
        this.context = context;
        this.presenter = presenter;
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
        holder.nombre.setText(teacherData.get(position).getNombre());
        holder.especialidad.setText(teacherData.get(position).getEspecialidad());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ChatMineActivity();
            }
        });
    }

    @Override
    public int getItemCount() {
        return teacherData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView nombre, especialidad;
        CardView cardView;
        ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            nombre = itemView.findViewById(R.id.tvName);
            especialidad = itemView.findViewById(R.id.tvEspecialidad);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }
}
