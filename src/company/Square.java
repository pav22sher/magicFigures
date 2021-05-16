package company;

import java.util.Scanner;
import java.io.IOException;
import java.time.LocalDateTime;

public class Square extends Figure {

    Scanner scanner = new Scanner(System.in);


    protected void parameters() {
        System.out.println(getName("Квадрат"));

        do {
            System.out.println("Введите размер сторон квадрата");
            width = scanner.nextFloat();

            if (width <= 0)
                System.out.println("Стороны прямоугольника не должны быть равны 0");
        }
        while (width <= 0 );

    }


    protected void getPerimeter(float width) {

        perimeter = 2 * (width + width);

    }

    protected void getArea(float width) {

       sq = width * width;

    }

    public void outPut() {

        System.out.println("Периметр равен: " + perimeter + "\n Площадь равна:" + sq);
    }

    protected void drowing(float width) {

        for (float i = 0; i < width; i++) {
            for (float j = 0; j < width; j++) {
                System.out.print('*');
            }

            System.out.println(' ');
        }
    }

}
