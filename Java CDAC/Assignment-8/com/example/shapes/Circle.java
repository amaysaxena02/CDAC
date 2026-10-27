package com.example.shapes;

import com.example.utils.MathUtils;
public class Circle {
    double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return MathUtils.getPI() * radius * radius;
    }

    
}
