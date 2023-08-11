package com.zj.createPattern.fatoryMethod;

// Logger.java
public interface Logger {
    void log(String message);
}

// FileLogger.java
 class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Logging message to file: " + message);
    }
}

// ConsoleLogger.java
 class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Logging message to console: " + message);
    }
}
