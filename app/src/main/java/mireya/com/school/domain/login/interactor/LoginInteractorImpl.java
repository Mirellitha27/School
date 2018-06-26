package mireya.com.school.domain.login.interactor;

import com.google.gson.JsonObject;

import mireya.com.school.api.RestApiAdapter;
import mireya.com.school.api.Service;
import mireya.com.school.domain.login.model.LoginData;
import mireya.com.school.domain.login.presenter.LoginPresenter;
import mireya.com.school.domain.login.repository.LoginRepository;
import mireya.com.school.domain.login.repository.LoginRepositoryImpl;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginInteractorImpl implements LoginInteractor {
    private LoginPresenter presenter;
    private LoginRepository repository;

    public LoginInteractorImpl(LoginPresenter presenter) {
        this.presenter = presenter;
        repository = new LoginRepositoryImpl(presenter);
    }

    @Override
    public void getDataUser() {
        repository.getDataUser();
    }
}
