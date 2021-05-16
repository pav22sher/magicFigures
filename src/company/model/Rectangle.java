package company.model;

import java.util.Scanner;

public class Rectangle extends Figure {
    private float width;
    private float height;

    //FIXME вынести в слой сервиса
    public void parameters(Scanner scanner) {
        System.out.println("Прямоугольник");
        do {
            System.out.println("Введите ширину прямоугольника");
            width = scanner.nextFloat();
            System.out.println("Введите высоту прямоугольника");
            height = scanner.nextFloat();
            if (width <= 0 || height <= 0 || width == height)
                System.out.println("Стороны прямоугольника не должны быть равны 0");
        }
        while (width <= 0 || height <= 0 || width == height);
    }

    public double getPerimeter() {
        perimeter = 2 * (height + width);
        return perimeter;
    }

    public double getArea() {
        sq = height * width;
        return sq;
    }
}
