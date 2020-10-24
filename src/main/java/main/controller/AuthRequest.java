package main.controller;

import lombok.Data;

@Data
public class AuthRequest {

    private String login;

    private String password;

    public AuthRequest() {
    }

    public AuthRequest(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public AuthRequest setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public AuthRequest setPassword(String password) {
        this.password = password;
        return this;
    }
}