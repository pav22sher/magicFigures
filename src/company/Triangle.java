package company;

import java.util.Scanner;
import java.time.LocalDateTime;
public class Triangle extends Figure {
    int ab;
    int bc;
    int ac;

    Scanner scanner = new Scanner(System.in);

    protected void parametrs() {
        System.out.println(getName("Треугольник"));

        do {
            System.out.println("Введите длину стороны АВ");
            ab = scanner.nextInt();
            System.out.println("Введите длину стороны АС");
            ac = scanner.nextInt();
            System.out.println("Введите длину стороны ВС");
            bc = scanner.nextInt();
            if(ab <= 0 || ac <= 0 || bc <=0)
            System.out.println("Стороны треугольника должны быть больше 0");
        }
        while (ab <= 0 || ac <= 0 || bc <=0);


    }

    protected int perimetr(int ab, int bc, int ac) {

        perimetr = ab + bc + ac;

        System.out.println("Периметр равен " + perimetr);
        return perimetr;
    }

    protected double getArea(int ab, int bc, int ac) {
        double halfperimetr = (ab + bc + ac)/2;
        sq = Math.sqrt(halfperimetr*((halfperimetr-ab)*(halfperimetr-bc)*(halfperimetr-ac)));

        System.out.println("Площадь равна " + sq);
        return sq;
    }


}
