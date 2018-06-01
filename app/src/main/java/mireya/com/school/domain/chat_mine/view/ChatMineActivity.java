package mireya.com.school.domain.chat_mine.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mireya.com.school.R;
import mireya.com.school.domain.chat_mine.preseter.ChatMinePresenter;
import mireya.com.school.domain.chat_mine.preseter.ChatMinePresenterImpl;

public class ChatMineActivity extends AppCompatActivity implements ChatMineView{
    private ChatMinePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_mine);
        setupVariable();
        setUpView();
    }

    private void setupVariable() {
        if (presenter == null) {
            presenter = new ChatMinePresenterImpl(this);
        }
    }

    private void setUpView() {}
}
