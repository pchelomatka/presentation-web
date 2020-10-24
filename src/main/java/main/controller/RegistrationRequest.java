package main.controller;

import lombok.Data;


@Data
public class RegistrationRequest {

    private String login;

    private String password;

    public String getLogin() {
        return login;
    }

    public RegistrationRequest setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public RegistrationRequest setPassword(String password) {
        this.password = password;
        return this;
    }
}