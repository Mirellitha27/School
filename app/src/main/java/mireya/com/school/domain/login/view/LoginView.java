package mireya.com.school.domain.login.view;

import mireya.com.school.domain.login.model.LoginData;

public interface LoginView {
    void getDataUser();
    void showDataUser(LoginData user);
    void goPostList();
}
