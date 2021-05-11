package course.module1;

/**
 * Урок4: Циклы
 */
public class Lesson4 {
    public static void main(String[] args) {
        int i = 1;
        for (; i<9;){
            System.out.print(i);
            i++;
        }
        System.out.println();
        i = 1;
        while (i < 9){
            System.out.print(i);
            i++;
        }
        System.out.println();
        i = 1;
        for (;;){
            if(i==9) break;//выход из цикла
            System.out.print(i);
            i++;
        }
        System.out.println();
    }
}
