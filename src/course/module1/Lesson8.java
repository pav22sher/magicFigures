package course.module1;

/**
 * Урок8: multicatch - ловим несколько ошибок!
 */
public class Lesson8 {
    public static void main (String args[]){
        try {
            int array[] = new int[5];
            array[10] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
