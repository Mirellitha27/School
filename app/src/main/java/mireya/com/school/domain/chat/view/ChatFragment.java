package mireya.com.school.domain.chat.view;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import mireya.com.school.R;
import mireya.com.school.domain.chat.adapter.ChatAdapter;
import mireya.com.school.domain.chat.data.ChatData;
import mireya.com.school.domain.chat.presenter.ChatPresenter;
import mireya.com.school.domain.chat.presenter.ChatPresenterImpl;
import mireya.com.school.domain.chat_mine.view.ChatMineActivity;

public class ChatFragment extends Fragment implements ChatFragmentView{

    public static String IDENTIFIER = "CHAT_FRAGMENT";
    private ChatPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        setUpVariable();
        setUpView(view);
        return view;
    }

    private void setUpVariable() {
        if (presenter == null) {
            presenter = new ChatPresenterImpl(this);
        }
    }

    private void setUpView(View view) {
        List<ChatData> teacherData = new ArrayList<>();
        teacherData.add(new ChatData("Mireya Jimenez", "En linea"));
        teacherData.add(new ChatData("Luis Manuel Castillo Zamorano", "Desconectado"));

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.Adapter adapter = new ChatAdapter(getContext(),presenter,teacherData);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void ChatMineActivity() {
        Intent intent = new Intent(getContext(), ChatMineActivity.class);
        startActivity(intent);

    }
}
