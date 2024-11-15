package Assignment_2;

import java.util.Scanner;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    private double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height / 3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner