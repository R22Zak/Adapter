package jv.oop.lab_13.demo.src.main.java.ua.edu.ucu.apps.db;

public class Main {
    public static void main(String[] args) {
        БазаДаних db = new БазаДаних();
        Авторизація авторизація = new Авторизація();
        if (авторизація.авторизуватися(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
