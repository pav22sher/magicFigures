package company;

import java.util.Scanner;
import java.io.IOException;

public class Main
{
    public static class Figure
    {

        protected String form;
        protected int heigth;
        protected int width;
        protected int sq;
        protected int perimetr;

    }

    public static class Square extends Figure{

        String form = "Квадрат";

        public int perimetr(int heigth, int width)
        {

            return perimetr = 2 * (heigth + width);

        }
        public int squ (int heigth, int width)
        {
            return sq = heigth * width;

        }

    }

    public static class Cicle{


    }



    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        Square square = new Square();

        System.out.println(square.form);


        System.out.println("Введите ширину квадрата");
        int width = scanner.nextInt();
        System.out.println("Введите высоту квадрата");
        int heigth = scanner.nextInt();

        if (width > 0 && heigth > 0)
        {
            System.out.println("Площадь равна " + square.squ(width, heigth));
            System.out.println("Периметр равен " + square.perimetr(width,heigth));
        }
        else
            System.out.println("некорректный ввод");

    }


}
