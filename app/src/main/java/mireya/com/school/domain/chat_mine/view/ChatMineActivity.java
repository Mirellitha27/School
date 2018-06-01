package mireya.com.school.domain.chat_mine.view;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.Objects;

import mireya.com.school.R;
import mireya.com.school.domain.chat_mine.adapter.ChatMineAdapter;
import mireya.com.school.domain.chat_mine.preseter.ChatMinePresenter;
import mireya.com.school.domain.chat_mine.preseter.ChatMinePresenterImpl;
import mireya.com.school.domain.login.view.LoginActivity;
import mireya.com.school.domain.main.view.MainActivity;

public class ChatMineActivity extends AppCompatActivity implements ChatMineView{
    private ChatMinePresenter presenter;
    private EditText edNewMessage;
    private RecyclerView recyclerView;
    ChatMineAdapter adapter;
    private int TEXT_LINES = 1;
    private FloatingActionButton sendMessage;

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

    private void setUpView() {
        sendMessage = findViewById(R.id.btnSaveMessage);
        enableButton();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" ");
    }

    @Override
    public void enableButton() {
        sendMessage.setEnabled(true);
        sendMessage.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorPrimaryDark)));
    }

    @Override
    public void disableButton() {
        sendMessage.setEnabled(false);
        sendMessage.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorGrey500)));
    }

    @Override
    public void goMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case android.R.id.home:
                goMain();
                break;
        }
        return true;
    }
}
