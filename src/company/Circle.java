package company;

import java.util.Scanner;

public class Circle extends Figure {

    private double perimeter;//TODO:вынести вобщий класс Figure
    Scanner scanner = new Scanner(System.in);//TODO: не делать scanner полем класса

    protected void parameters(Scanner scanner) {
        System.out.println(getName("Круг"));
        do {
            System.out.println("Введите радиус круга");
            radius = this.scanner.nextInt();
            if (radius <= 0)
                System.out.println("Радиус круга должны быть больше 0");//TODO: попробуй использывать exception
        }
        while (radius <= 0);

    }


    protected double getPerimeter(int radius) {//TODO: сделать метод public и переопределить

        perimeter = 2 * Math.PI * radius;
        System.out.println("Периметр равен " + perimeter);
        return perimeter;
    }

    protected double getArea(int radius) {//TODO: сделать метод public и переопределить

        sq = Math.PI * (radius * radius);
        System.out.println("Площадь равна " + sq);
        return sq;
    }

    public void outPut() {

        System.out.println("Периметр равен: " + perimeter + "\n Площадь равна:" + sq);
    }
}

