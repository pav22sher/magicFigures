package course.module1;

/**
 * Урок5: break и continue
 */
public class Lesson5 {
    public static void main(String[] args) {
        //Выход из вложенных циклов с помощью метки
        outer:
        for (int k = 0; k < 10; k++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(" k="+k+" j="+j);
                if (j == 1) {
                    break outer;
                }
            }
        }
        System.out.println("Цикл завершен.");

        for (int i = 0; i < 10; i++){
            if (i == 5)
                continue;//переход на следующую итерацию
            System.out.print(i);
        }//итог вывод всех чисел кропе 5
    }
}
