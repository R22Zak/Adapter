package jv.oop.lab_13.demo.src.main.java.ua.edu.ucu.apps.db;

public class FacebookUser {
    private final String email;
    private final String userCountry;
    private final long userActiveTime; // Epoch time in milliseconds

    public FacebookUser(String email, String userCountry, long userActiveTime) {
        this.email = email;
        this.userCountry = userCountry;
        this.userActiveTime = userActiveTime;
    }

    public String getEmail() {
        return email;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public long getUserActiveTime() {
        return userActiveTime;
    }
}

