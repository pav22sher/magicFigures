package course.module1;

/**
 * Урок1: Upcasting и Downcasting
 */
public class Lesson1 {
    public static void main(String[] args) {
        //Upcasting-Автомотическое(неявное)(расширяющие) преобразование
        //Примеры:
        int a1 = 10;
        float a2 = a1;
        double a3 = a2;
        //Downcasting-Ручное(явное)(сужающее) преобразование
        //Примеры:
        double a4 = 10.1;
        float a5 = (float) a4;
        int a6 = (int) a5;
    }
}
