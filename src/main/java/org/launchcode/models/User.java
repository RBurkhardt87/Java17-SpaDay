package org.launchcode.models;

public class User {

    //TODO: Create fields for username, email & password
    private String username;
    private String email;
    private String password;

    //TODO: Create constructor for User Object
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    //TODO: Create Getters/Setters for fields (username, email, password)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
