package com.mycompany.chapter7;

public class ShapeInheritance {

    // Superclass
    static class Shape {
        public void rotate() {
            System.out.println("Generic rotate");
        }
        public void playSound() {
            System.out.println("Generic sound");
        }
    }

    // Subclasses that inherit rotate() and playSound() from Shape
    static class Square extends Shape { }

    static class Circle extends Shape { }

    static class Triangle extends Shape { }

    // Amoeba overrides both methods with its own specific behavior
    static class Amoeba extends Shape {
        @Override
        public void rotate() {
            System.out.println("Amoeba-specific rotate");
        }
        @Override
        public void playSound() {
            System.out.println("Amoeba-specific sound");
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = { new Square(), new Circle(), new Triangle(), new Amoeba() };
        for (Shape s : shapes) {
            s.rotate();
            s.playSound();
        }
    }
}