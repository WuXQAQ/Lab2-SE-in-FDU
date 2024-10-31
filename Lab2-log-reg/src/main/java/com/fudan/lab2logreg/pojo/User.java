package com.fudan.lab2logreg.pojo;

import lombok.Data;

@Data
public class User {
    private int uid;
    private String username;
    private String email;
    private String password;
    private boolean role; // true for teacher (1), false for student (0)

    public User(int uid, String username, String email, String password, boolean role) {
        this.uid = uid;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }
}
