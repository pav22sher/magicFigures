package company;

import java.util.Scanner;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static String start() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выбери фигуру");

        System.out.println("1. Квадрат\n" + "2. Прямоугольник\n" + "3. Круг\n" + "4. Треугольник\n Ваш ввод:  ");

        int caseSwitch = scanner.nextInt();
        switch (caseSwitch) {
            case 1:
                Square square = new Square();
                square.parametrs();
                square.perimetr(square.width, square.heigth);
                square.getArea(square.width, square.heigth);
                square.drowing(square.width, square.heigth);
                break;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.parametrs();
                rectangle.perimetr(rectangle.heigth, rectangle.width);
                rectangle.getArea(rectangle.heigth, rectangle.width);
                rectangle.drowing(rectangle.heigth, rectangle.width);
                break;
            case 3:
                Circle circle = new Circle();
                circle.parametrs();
                circle.perimetr(circle.radius);
                circle.getArea(circle.radius);
                circle.drowing(circle.radius);
                break;
            case 4:
                Triangle triangle = new Triangle();
                triangle.parametrs();
                triangle.perimetr(triangle.ab, triangle.bc, triangle.ac);
                triangle.getArea(triangle.ab, triangle.bc, triangle.ac);
                break;
            default:
                System.out.println("Некорректный ввод, попробуйте еще раз");
                break;
        }
        LocalDateTime createdAt = LocalDateTime.now();
        StringBuilder builder = new StringBuilder();
        builder.append("Время создания:").append(createdAt.format(DateTimeFormatter.ofPattern("HH:mm:ss \t dd/MM/yyyy\t")));

        return builder.toString();




    }


    public static void main(String[] args) throws IOException {

        start();
    }
}