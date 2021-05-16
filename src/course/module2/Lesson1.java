package course.module2;

import java.util.stream.Stream;

/**
 * Урок1: Обобщения (Generics) - Стирания типов (Type Erasure)
 */
public class Lesson1 {
    static class Holder<T> {
        private T value;

        public Holder(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        //both methods have same erasure-оба метода имеют одинаковое стирание
        /*public void doSomething(T obj) {
        }
        public void doSomething(Object obj) {
        }*/
    }
    public static void main(String[] args) {
        System.out.println("Node1:");
        Stream.of(Holder.class.getDeclaredMethods())
                .forEach(System.out::println);
    }
}
