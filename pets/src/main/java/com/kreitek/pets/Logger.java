package com.kreitek.pets;

public class Logger {
    private static Logger instance;
    private int counter;

    private Logger() {
        this.counter = 0;
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public void debug(String message) {
        this.counter++;
        System.out.println("[debug][" + this.counter + "] - " + message);
    }
}
