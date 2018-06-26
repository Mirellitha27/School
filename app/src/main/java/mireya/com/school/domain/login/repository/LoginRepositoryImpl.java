package mireya.com.school.domain.login.repository;

import android.support.annotation.NonNull;

import com.google.gson.JsonObject;

import mireya.com.school.api.RestApiAdapter;
import mireya.com.school.api.Service;
import mireya.com.school.domain.login.model.LoginData;
import mireya.com.school.domain.login.presenter.LoginPresenter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginRepositoryImpl implements  LoginRepository{
    private LoginPresenter presenter;

    public LoginRepositoryImpl(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getDataUser() {

        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<JsonObject> call =  service.getDataUser();

        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(@NonNull Call<JsonObject> call, @NonNull Response<JsonObject> response) {
                JsonObject userJson = response.body().getAsJsonObject("data");
                LoginData user = new LoginData(
                        userJson.get("idUser").getAsString(),
                        userJson.get("name").getAsString(),
                        userJson.get("lastname").getAsString()
                );

                presenter.showDataUser(user);
            }

            @Override
            public void onFailure(@NonNull Call<JsonObject> call, Throwable t) {

            }
        });

    }
}
