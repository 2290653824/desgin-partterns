package com.zj.createPattern.simpleFactory;

// Shape.java
public interface Shape {
    void draw();
}

// Circle.java
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle.java
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
