package com.example.techprotocol.models;

public class Friend {
    String host;
    String email;
    String desemail;

    public Friend(String host, String email, String desemail) {
        this.email = email;
        this.desemail = desemail;
        this.host = host;
    }

    public Friend() {
    }

    public String getDesemail() {
        return desemail;
    }

    public void setDesemail(String desemail) {
        this.desemail = desemail;
    }

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
