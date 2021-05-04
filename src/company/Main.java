package company;

import company.model.Circle;
import company.model.Rectangle;
import company.model.Square;
import company.model.Triangle;

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
        System.out.println(new Circle(3));
        System.out.println(new Rectangle(2,4));
        System.out.println(new Square(5));
        System.out.println(new Triangle(5,6,7));
    }
}
