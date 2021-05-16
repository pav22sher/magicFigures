package company;

import company.model.Circle;
import company.model.Rectangle;
import company.model.Square;

import java.util.Scanner;

/**
 * Главный класс =)
 */
public class Main
{
    /**
     * Точка входа в приложение
     * @param args аргументы командной строки =)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите радиус окружности:");
        float r = input.nextFloat();
        System.out.println(new Circle(r));

        System.out.println("Введите высоту прямоугольника:");
        float h = input.nextFloat();
        System.out.println("Введите длинну прямоугольника:");
        float w = input.nextFloat();
        System.out.println(new Rectangle(h,w));

        System.out.println("Введите сторону квадрата:");
        float a = input.nextFloat();
        System.out.println(new Square(a));

        /*System.out.println("Введите радиус окружности:");
        System.out.println(new Triangle(5,6,7));*/
    }
}
