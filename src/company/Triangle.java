package company;

import java.util.Scanner;

public class Triangle extends Figure {
    float ab;
    float bc;
    float ac;

    Scanner scanner = new Scanner(System.in);

    protected void parameters() {
        System.out.println(getName("Треугольник"));

        do {
            System.out.println("Введите длину стороны АВ");
            ab = scanner.nextFloat();
            System.out.println("Введите длину стороны АС");
            ac = scanner.nextFloat();
            System.out.println("Введите длину стороны ВС");
            bc = scanner.nextFloat();
            if(ab <= 0 || ac <= 0 || bc <=0)
            System.out.println("Стороны треугольника должны быть больше 0");
        }
        while (ab <= 0 || ac <= 0 || bc <=0);


    }

    protected double getPerimeter(float ab, float bc, float ac) {

        perimeter = ab + bc + ac;

        return perimeter;
    }

    protected double getArea(float ab, float bc, float ac) {
        float halfperimetr = (ab + bc + ac)/2;
        sq = Math.sqrt(halfperimetr*((halfperimetr-ab)*(halfperimetr-bc)*(halfperimetr-ac)));
return sq;
    }
    public void outPut() {

        System.out.println("Периметр равен: " + perimeter + "\n Площадь равна:" + sq);
    }

}
