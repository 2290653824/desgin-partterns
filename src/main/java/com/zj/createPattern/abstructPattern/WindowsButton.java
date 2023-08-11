package com.zj.createPattern.abstructPattern;

// WindowsButton.java
public class WindowsButton implements AbstractButton {
    @Override
    public void click() {
        System.out.println("Windows button clicked");
    }
}

// WindowsWindow.java
 class WindowsWindow implements AbstractWindow {
    @Override
    public void render() {
        System.out.println("Windows window rendered");
    }
}

// MacOSButton.java
 class MacOSButton implements AbstractButton {
    @Override
    public void click() {
        System.out.println("MacOS button clicked");
    }
}

// MacOSWindow.java
 class MacOSWindow implements AbstractWindow {
    @Override
    public void render() {
        System.out.println("MacOS window rendered");
    }
}
