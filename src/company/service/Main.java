package company.service;

import company.View.MainMenu;
import company.model.*;
import company.repository.ReadObject;
import company.repository.WriteObject;

import java.util.Scanner;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        MainMenu mm = new MainMenu();
        mm.MainMenu();
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        int caseSwitch;

        System.out.println("Выбери фигуру");
        System.out.println("""
                1. Квадрат
                2. Прямоугольник
                3. Круг
                4. Треугольник
                 Ваш ввод: \s""");
        caseSwitch = scanner.nextInt();
        switch (caseSwitch) {
            case 1:
                createSquare(scanner);
                break;
            case 2:
                createRectangle(scanner);
                break;
            case 3:
                createCircle(scanner);
                break;
            case 4:
                createTriangle(scanner);
                break;
            default:
                System.out.println("Некорректный ввод, попробуйте еще раз");
                break;
        }
    }

    private static void createTriangle(Scanner scanner) {
        Triangle triangle = new Triangle();
        triangle.parameters(scanner);
        triangle.getPerimeter();
        triangle.getArea();
        triangle.getResult();
    }

    private static void createCircle(Scanner scanner) {
        Circle circle = new Circle();
        circle.parameters(scanner);
        circle.getPerimeter();
        circle.getArea();
        circle.getResult();
    }

    private static void createRectangle(Scanner scanner) {
        Rectangle rectangle = new Rectangle();
        rectangle.parameters(scanner);
        rectangle.getPerimeter();
        rectangle.getArea();
        rectangle.getResult();
    }

    private static void createSquare(Scanner scanner) {
        Square square = new Square();
        square.parameters(scanner);
        square.getPerimeter();
        square.getArea();
        square.getResult();
    }

}