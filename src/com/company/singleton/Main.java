package com.company.singleton;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.query();
        Database database1 = Database.getInstance();
        database1.query();
    }
}
