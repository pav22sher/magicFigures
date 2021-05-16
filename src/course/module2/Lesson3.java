package course.module2;

import java.util.ArrayList;
import java.util.List;

/**
 * Урок3: Обобщения (Generics) - Особенности использования
 */
public class Lesson3 {

    //Так нельзя Generics не дружет с подклассами Throwable
    /*static class MyException<T> extends Exception{
    }*/

    //Так нельзя Generics не дружет с перечислениями
    /*enum Language<T>{
    }*/

    static class Utilities {
        //Статический параметризованный метод
        public static <T> void fill(List<T> list, T val) {
            for (int i = 0; i < list.size(); i++)
                list.set(i, val);
        }
    }

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        Utilities.fill(ints,1);

        List<Double> doubles = new ArrayList<>(5);
        doubles.add(1d);
        doubles.add(2d);
        Utilities.fill(doubles,2d);
    }
}