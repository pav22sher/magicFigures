package company;

import java.util.Scanner;

public class Circle extends Figure {

    private double perimetr;
    Scanner scanner = new Scanner(System.in);

    protected void parametrs() {
        System.out.println(getName("Круг"));
        do {
            System.out.println("Введите радиус круга");
            radius = scanner.nextInt();
            if (radius <= 0)
                System.out.println("Радиус круга должны быть больше 0");
        }
        while (radius <= 0);

    }


    protected double perimetr(int radius) {

        perimetr = 2 * Math.PI * radius;
        System.out.println("Периметр равен " + perimetr);
        return perimetr;
    }

    protected double getArea(int radius) {

        sq = Math.PI * (radius * radius);
        System.out.println("Площадь равна " + sq);
        return sq;
    }

    protected void drowing(int radius) {

    }
}

