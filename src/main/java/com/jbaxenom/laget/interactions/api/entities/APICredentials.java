package com.jbaxenom.laget.interactions.api.entities;

/**
 * @author jbaxenom on 4/30/14.
 */
public class APICredentials {

    private String username;
    private String password;

    public APICredentials() {}

    public APICredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
