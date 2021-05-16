package company.service;

import company.model.*;
import company.repository.ReadObject;
import company.repository.WriteObject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String userName = scanner.next();
        User userWrite = new User(userName);
        System.out.println("userWrite: " + userWrite);
        WriteObject.write(userWrite);

        User userRead = ReadObject.read();
        System.out.println("userRead: " + userRead);

        System.out.println("Выбери фигуру");
        System.out.println("""
                1. Квадрат
                2. Прямоугольник
                3. Круг
                4. Треугольник
                 Ваш ввод: \s""");
        int caseSwitch = scanner.nextInt();
        switch (caseSwitch) {
            case 1:
                Square square = new Square();
                square.parameters(scanner);
                square.getPerimeter();
                square.getArea();
                break;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.parameters(scanner);
                rectangle.getPerimeter();
                rectangle.getArea();
                break;
            case 3:
                Circle circle = new Circle();
                circle.parameters(scanner);
                circle.getPerimeter();
                circle.getArea();
                break;
            case 4:
                Triangle triangle = new Triangle();
                triangle.parameters(scanner);
                triangle.getPerimeter();
                triangle.getArea();
                break;
            default:
                System.out.println("Некорректный ввод, попробуйте еще раз");
                break;
        }
    }

}