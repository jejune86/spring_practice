package com.example.starthere7.model;

import com.example.starthere7.service.LoggedUserManagementService;
import com.example.starthere7.service.LoginCountService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService
    , LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    private String username;
    private String password;

    public boolean login() {
        loginCountService.increment();
        String username = this.username;
        String password = this.password;

        boolean loginResult = false;
        if (username.equals("admin") && password.equals("admin")) {
            loginResult = true;
            loggedUserManagementService.setUsername("admin");
        }
        return loginResult;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
