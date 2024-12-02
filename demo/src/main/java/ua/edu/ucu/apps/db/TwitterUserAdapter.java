package jv.oop.lab_13.demo.src.main.java.ua.edu.ucu.apps.db;

public class TwitterUserAdapter implements User {
    private final TwitterUser twitterUser;

    public TwitterUserAdapter(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }
//
    @Override
    public long getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }
}

