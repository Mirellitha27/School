package mireya.com.school.domain.settings.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mireya.com.school.R;
import mireya.com.school.domain.settings.presenter.SettingsPresenter;
import mireya.com.school.domain.settings.presenter.SettingsPresenterImpl;

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
    }
}
