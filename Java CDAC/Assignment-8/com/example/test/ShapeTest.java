package com.example.test;

public class ShapeTest {
    public static void main(String[] args) {
        com.example.shapes.Circle circle = new com.example.shapes.Circle(5.0);
        double area = circle.getArea();
        System.out.println("Area of the circle: " + area);
    }
}
