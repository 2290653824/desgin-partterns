package com.zj.createPattern.fatoryMethod;

// Main.java
public class Main {
    public static void main(String[] args) {
        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        Logger fileLogger = fileLoggerFactory.createLogger();
        fileLogger.log("This is a log message for the file logger");

        LoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
        Logger consoleLogger = consoleLoggerFactory.createLogger();
        consoleLogger.log("This is a log message for the console logger");
    }
}
