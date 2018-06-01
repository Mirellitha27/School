package mireya.com.school.domain.settings.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import mireya.com.school.R;
import mireya.com.school.domain.settings.presenter.SettingsPresenter;
import mireya.com.school.domain.settings.presenter.SettingsPresenterImpl;
import mireya.com.school.domain.splash.view.SplashActivity;

public class SettingsFragment extends Fragment implements SettingsFragmentView{

    public static String IDENTIFIER = "SETTINGS_FRAGMENT";
    private SettingsPresenter presenter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        setUpVariable();
        setUpView(view);
        return view;
    }

    private void setUpVariable() {
        if (presenter == null) {
            presenter = new SettingsPresenterImpl(this);
        }
    }

    private void setUpView(View view) {
        CardView cardViewLogout = view.findViewById(R.id.cvSignOff);
        cardViewLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goSplash();
            }
        });
    }

    @Override
    public void goSplash() {
        Intent intent = new Intent(getActivity(), SplashActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

        if(getActivity() != null){
            getActivity().finish();
        }
    }
}
