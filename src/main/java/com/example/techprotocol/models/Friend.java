package com.example.techprotocol.models;

public class Friend {
    String host;
    String email;

    public Friend(String host, String email) {
        this.host = host;
        this.email = email;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
