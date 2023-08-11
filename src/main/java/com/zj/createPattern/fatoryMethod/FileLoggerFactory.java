package com.zj.createPattern.fatoryMethod;

// FileLoggerFactory.java
public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}

// ConsoleLoggerFactory.java
 class ConsoleLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
