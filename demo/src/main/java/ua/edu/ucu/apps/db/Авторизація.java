package jv.oop.lab_13.demo.src.main.java.ua.edu.ucu.apps.db;

public class Авторизація {
    public boolean авторизуватися(БазаДаних db) {
        db.отриматиДаніКористувача();
        return true;
    }
}
