package company.model;

import java.util.Scanner;

public class Triangle extends Figure {
    float ab;
    float bc;
    float ac;

    //FIXME вынести в слой сервиса
    public void parameters(Scanner scanner) {
        System.out.println("Треугольник");
        do {
            System.out.println("Введите длину стороны АВ");
            ab = scanner.nextFloat();
            System.out.println("Введите длину стороны АС");
            ac = scanner.nextFloat();
            System.out.println("Введите длину стороны ВС");
            bc = scanner.nextFloat();
            if (ab <= 0 || ac <= 0 || bc <= 0)
                System.out.println("Стороны треугольника должны быть больше 0");
        }
        while (ab <= 0 || ac <= 0 || bc <= 0);
    }

    public double getPerimeter() {
        perimeter = ab + bc + ac;
        return perimeter;
    }

    public double getArea() {
        float halfperimetr = (ab + bc + ac) / 2;
        sq = (float) Math.sqrt(halfperimetr * ((halfperimetr - ab) * (halfperimetr - bc) * (halfperimetr - ac)));
        return sq;
    }

}
