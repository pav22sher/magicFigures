package course.module1;

/**
 * Урок1:
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

        //Конструкция switch
        int num = 1;
        switch (num) {
            case 1:
            case 2://обработка нескольких значений
                System.out.println("число равно 1 или 2");//выведит
                //break;оберем брэйк
            case 3: //и увидем, что
                System.out.println("число равно 3 или 4");//это тоже сработает
                break;//выход из блока свича
            default:
                System.out.println("число не равно 1, 2, 3, 4");//блок по умолчанию
        }

        //Тернарная операция~Конструкция if/else
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

        //Циклы for и while
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

    }
}
