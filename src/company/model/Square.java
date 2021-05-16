package company.model;

import java.util.Scanner;

public class Square extends Figure {
    private float width;

    //FIXME вынести в слой сервиса
    public void parameters(Scanner scanner) {
        System.out.println("Квадрат");
        do {
            System.out.println("Введите размер сторон квадрата");
            width = scanner.nextFloat();
            if (width <= 0)
                System.out.println("Стороны прямоугольника не должны быть равны 0");
        }
        while (width <= 0);

    }

    public double getPerimeter() {
        perimeter = 2 * (width + width);
        return perimeter;
    }

    public double getArea() {
        sq = width * width;
        return sq;
    }
}
