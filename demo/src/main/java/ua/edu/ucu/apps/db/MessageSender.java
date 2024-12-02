package jv.oop.lab_13.demo.src.main.java.ua.edu.ucu.apps.db;

import java.time.Instant;

public class MessageSender {
    public void send(String text, User user, String country) {
        // Check if the user is from the specified country
        if (!user.getCountry().equalsIgnoreCase(country)) {
            System.out.println("User is not from the specified country.");
            return;
        }

        // Check if the user was active within the last hour
        long currentTime = Instant.now().toEpochMilli();
        long oneHourInMillis = 3600 * 1000;

        if (currentTime - user.getLastActiveTime() > oneHourInMillis) {
            System.out.println("User was not active in the last hour.");
            return;
        }

        // Send the message
        System.out.println("Sending message to " + user.getEmail() + ": " + text);
    }
}

