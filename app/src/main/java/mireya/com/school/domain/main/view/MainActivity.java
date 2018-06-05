package mireya.com.school.domain.main.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import mireya.com.school.R;
import mireya.com.school.domain.chat.view.ChatFragment;
import mireya.com.school.domain.main.presenter.MainPresenter;
import mireya.com.school.domain.main.presenter.MainPresenterImpl;
import mireya.com.school.domain.settings.view.SettingsFragment;
import mireya.com.school.domain.subject.view.SubjectFragment;
import mireya.com.school.domain.teacher.view.TeacherFragment;

public class MainActivity extends AppCompatActivity implements MainView{

    private MainPresenter presenter;
    private BottomNavigationViewEx navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpVariable();
        setUpView();
        showTeacherFragment();
    }

    private void setUpVariable() {
        if (presenter == null) {
            presenter = new MainPresenterImpl(this);
        }

    }

    private void setUpView() {
        navigation = findViewById(R.id.navigation);
        navigation.enableAnimation(true);
        navigation.enableShiftingMode(false);
        navigation.enableItemShiftingMode(false);

        setUpBottomNavigationBar();
    }

    private void setUpBottomNavigationBar() {
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_teacher:
                        showTeacherFragment();
                        return true;
                    case R.id.navigation_subject:
                        showSubjectFragment();
                        return true;
                    case R.id.navigation_chat:
                        showChatFragment();
                        return true;
                    case R.id.navigation_settings:
                        showSettingsFragment();
                        return true;
                }
                return false;
            }
        });
    }

    private void showTeacherFragment() {
        TeacherFragment teacherFragment = (TeacherFragment) getSupportFragmentManager().findFragmentByTag(TeacherFragment.IDENTIFIER);
        if(teacherFragment == null){
            teacherFragment = new TeacherFragment();
        }

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, teacherFragment, TeacherFragment.IDENTIFIER)
                .commit();
    }

    private void showSubjectFragment() {
        SubjectFragment subjectFragment = (SubjectFragment) getSupportFragmentManager().findFragmentByTag(SubjectFragment.IDENTIFIER);
        if(subjectFragment == null){
            subjectFragment = new SubjectFragment();
        }

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, subjectFragment, SubjectFragment.IDENTIFIER)
                .commit();
    }

    private void showChatFragment() {
        ChatFragment chatFragment = (ChatFragment) getSupportFragmentManager().findFragmentByTag(ChatFragment.IDENTIFIER);
        if(chatFragment == null){
            chatFragment = new ChatFragment();
        }

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, chatFragment, ChatFragment.IDENTIFIER)
                .commit();
    }

    private void showSettingsFragment() {
        SettingsFragment settingsFragment = (SettingsFragment) getSupportFragmentManager().findFragmentByTag(SettingsFragment.IDENTIFIER);
        if(settingsFragment == null){
            settingsFragment = new SettingsFragment();
        }

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, settingsFragment, SettingsFragment.IDENTIFIER)
                .commit();
    }


}
