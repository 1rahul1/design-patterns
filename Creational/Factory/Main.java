package Creational.Factory;

public class Main {
    public static void main(String[] args) {
        ShapeInstanceFactory shapeFactory = new ShapeInstanceFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.computeArea();
        Shape square = shapeFactory.getShape("SQUARE");
        square.computeArea();
    }
}
