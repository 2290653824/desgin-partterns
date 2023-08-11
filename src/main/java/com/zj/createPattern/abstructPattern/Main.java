package com.zj.createPattern.abstructPattern;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating Windows style UI components
        AbstractGUIFactory windowsFactory = new WindowsGUIFactory();
        AbstractButton windowsButton = windowsFactory.createButton();
        AbstractWindow windowsWindow = windowsFactory.createWindow();
        windowsButton.click();
        windowsWindow.render();

        // Creating MacOS style UI components
        AbstractGUIFactory macosFactory = new MacOSGUIFactory();
        AbstractButton macosButton = macosFactory.createButton();
        AbstractWindow macosWindow = macosFactory.createWindow();
        macosButton.click();
        macosWindow.render();
    }
}
