package company;

import java.util.Scanner;

public class Rectangle extends Figure {


    Scanner scanner = new Scanner(System.in);


    protected void parametrs() {
        System.out.println(getName("Прямоугольник"));

        do {
            System.out.println("Введите ширину прямоугольника");
            width = scanner.nextInt();
            System.out.println("Введите высоту прямоугольника");
            heigth = scanner.nextInt();
            if (width <= 0 || heigth <= 0 || width != heigth)
                System.out.println("Стороны прямоугольника не должны быть равны 0");
        }
        while (width <= 0 || heigth <= 0 || width != heigth);


    }


    protected int perimetr(int heigth, int width) {

        perimetr = 2 * (heigth + width);

        System.out.println("Периметр равен " + perimetr);
        return perimetr;
    }

    protected int getArea(int heigth, int width) {

        int sq = heigth * width;

        System.out.println("Площадь равна " + sq);
        return sq;
    }

    protected void drowing(int heigth, int width) {
        int _heigth = heigth;
        int _width = width;
        for (int i = 0; i < _width; i++) {
            for (int j = 0; j < _heigth; j++) {
                System.out.print('*');
            }

            System.out.println(' ');
        }
    }

}
