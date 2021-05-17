package company.model;

import java.util.Scanner;

public class Circle extends Figure {
    private float radius;

    //FIXME вынести в слой сервиса
    public void parameters(Scanner scanner) {
        System.out.println("Круг");
        do {
            System.out.println("Введите радиус круга");
            radius = scanner.nextInt();
            if (radius <= 0)
                System.out.println("Радиус круга должны быть больше 0");
        }
        while (radius <= 0);
    }

    public double getPerimeter() {
        perimeter = (float) (2 * Math.PI * radius);
        return perimeter;
    }

    public double getArea() {
        sq = (float) (Math.PI * (radius * radius));
        return sq;
    }


}

