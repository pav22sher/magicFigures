package course.module1;

/**
 * Урок2: Конструкция switch
 */
public class Lesson2 {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
            case 2://обработка нескольких значений
                System.out.println("число равно 1 или 2");
                //break;уберем брэйк
            case 3: //и увидем, что
                System.out.println("число равно 3 или 4");//это тоже сработает
                break;//выход из блока свича
            default://блок по умолчанию(если ни одно из условий не сработало)
                System.out.println("число не равно 1, 2, 3, 4");
        }
    }
}
