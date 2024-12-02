package jv.oop.lab_13.demo.src.main.java.ua.edu.ucu.apps.db;

public class TwitterUser {
    private final String userMail;
    private final String country;
    private final long lastActiveTime; // Epoch time in milliseconds

    public TwitterUser(String userMail, String country, long lastActiveTime) {
        this.userMail = userMail;
        this.country = country;
        this.lastActiveTime = lastActiveTime;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getCountry() {
        return country;
    }

    public long getLastActiveTime() {
        return lastActiveTime;
    }
}
