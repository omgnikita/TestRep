package com.company.singleton;

public class Database {
    private static Database instance;

    private Database() {
    }

    public void query() {
        System.out.println("Add query!");
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
}
