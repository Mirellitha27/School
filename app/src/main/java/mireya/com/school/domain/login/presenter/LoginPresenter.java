package mireya.com.school.domain.login.presenter;

import mireya.com.school.domain.login.model.LoginData;
import mireya.com.school.domain.login.view.LoginView;

public interface LoginPresenter {
    void getDataUser();
    void showDataUser(LoginData user);//vista
}
