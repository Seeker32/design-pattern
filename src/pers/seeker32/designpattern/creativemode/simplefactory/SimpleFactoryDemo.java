package pers.seeker32.designpattern.creativemode.simplefactory;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("circle");
        Shape rectangle = ShapeFactory.createShape("rectangle");
        Shape triangle = ShapeFactory.createShape("triangle");

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
