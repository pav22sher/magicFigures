package task;

import java.math.BigDecimal;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Как сравнить два вещественных числа?");
        System.out.println("==?" + (0.1*3 == 0.3));
        System.out.println("Double.compare?"+(Double.compare(0.1*3,0.3)==0));
        System.out.println("Посмотрим что внутри");
        System.out.println(0.1*3);
        System.out.println(0.3);
        System.out.println("Почему они реально разные?");
        System.out.println();
        System.out.println("Чтобы сравнить вещественные числа используем класс BigDecimal");
        System.out.println("###BigDecimal###");
        BigDecimal decimal1 = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(3));
        BigDecimal decimal2 = BigDecimal.valueOf(0.3);
        System.out.println(decimal1.compareTo(decimal2)==0);
        System.out.println("###BigDecimal###");
        System.out.println();
        System.out.println("Пример неточности представления вещественных данных в компьютере");
        System.out.println("###fori###");
        for (float i = 0.1f; i < 1; i+=0.1f) {
            System.out.println(i);
        }
        System.out.println("###fori###");
    }
}
