package company;

import java.util.Scanner;

public class Rectangle extends Figure {


    Scanner scanner = new Scanner(System.in);


    protected void parameters() {
        System.out.println(getName("Прямоугольник"));

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


    protected double getPerimeter(float height, float width) {

        perimeter = 2 * (height + width);
        return perimeter;
    }

    protected double getArea(float height, float width) {
        sq = height * width;


        return sq;
    }

    public void outPut() {

        System.out.println("Периметр равен: " + perimeter + "\n Площадь равна:" + sq);

    }

}
