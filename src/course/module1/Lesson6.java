package course.module1;

/**
 * Урок6: Varargs — аргументы переменной длины
 */
public class Lesson6 {
    public static void main (String args[]){
        sum(1, 2, 3);
        sum(1, 2, 3, 4, 5);
        sum();
    }

    /**
     * Сумма чисел.
     * @param nums переменное количество чисел.
     */
    static void sum(int ...nums){
        int result =0;
        for(int n: nums)
            result += n;
        System.out.println(result);
    }
}
