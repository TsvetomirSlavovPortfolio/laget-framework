package com.jbaxenom.laget.domain.core.actors;

/**
 * @author jbaxenom on 4/11/15.
 */
public abstract class WebAppActor extends WebActor {

    private String username;
    private String password;

    public WebAppActor(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public WebAppActor withUsername(String username) {
        this.username = username;
        return this;
    }

    public WebAppActor withPassword(String password) {
        this.password = password;
        return this;
    }

    public String username() {
        return username;
    }

    public String password() {
        return password;
    }

}
