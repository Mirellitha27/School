package mireya.com.school.domain.login.model;

public class LoginData {
    private String idUser;
    private String name;
    private String lastname;

    public LoginData(String idUser, String name, String lastname) {
        this.idUser = idUser;
        this.name = name;
        this.lastname = lastname;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
