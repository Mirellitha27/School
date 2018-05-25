package mireya.com.school.domain.chat.view;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mireya.com.school.R;
import mireya.com.school.domain.chat.presenter.ChatPresenter;
import mireya.com.school.domain.chat.presenter.ChatPresenterImpl;

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
    }
}
