package course.module1;

/**
 * Урок3: Тернарная операция и Конструкция if/else
 */
public class Lesson3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        //Конструкция if/else
        int max1;
        if (x > y) {
            max1 = x;
        } else {
            max1 = y;
        }
        System.out.println("max=" + max1);
        //Тернарная операция
        int max2 = x > y ? x : y;
        System.out.println("max=" + max2);
    }
}
