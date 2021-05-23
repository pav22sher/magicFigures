package company.service;

import company.model.Circle;
import company.model.Rectangle;
import company.model.Square;
import company.model.Triangle;

import java.util.Scanner;

public final class MainService {
    public static void createTriangle(Scanner scanner) {
        Triangle triangle = new Triangle();
        triangle.parameters(scanner);
        triangle.getPerimeter();
        triangle.getArea();
        triangle.getResult();
    }

    public static void createCircle(Scanner scanner) {
        Circle circle = new Circle();
        circle.parameters(scanner);
        circle.getPerimeter();
        circle.getArea();
        circle.getResult();
    }

    public static void createRectangle(Scanner scanner) {
        Rectangle rectangle = new Rectangle();
        rectangle.parameters(scanner);
        rectangle.getPerimeter();
        rectangle.getArea();
        rectangle.getResult();
    }

    public static void createSquare(Scanner scanner) {
        Square square = new Square();
        square.parameters(scanner);
        square.getPerimeter();
        square.getArea();
        square.getResult();
    }
}
