package com.zj.createPattern.abstructPattern;

// WindowsGUIFactory.java
public class WindowsGUIFactory implements AbstractGUIFactory {
    @Override
    public AbstractButton createButton() {
        return new WindowsButton();
    }

    @Override
    public AbstractWindow createWindow() {
        return new WindowsWindow();
    }
}

// MacOSGUIFactory.java
 class MacOSGUIFactory implements AbstractGUIFactory {
    @Override
    public AbstractButton createButton() {
        return new MacOSButton();
    }

    @Override
    public AbstractWindow createWindow() {
        return new MacOSWindow();
    }
}
