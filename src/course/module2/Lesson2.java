package course.module2;

import java.util.stream.Stream;

/**
 * Урок2: Обобщения (Generics) - Бридж(bridge) методы
 */
public class Lesson2 {
    //До стирания
    static class Node1<T> {
        private T data;
        public Node1(T data) {
            this.data = data;
        }
        public void setData(T data) {
            this.data = data;
        }
    }
    static class IntegerNode1 extends Node1<Integer> {
        public IntegerNode1(Integer data) {
            super(data);
        }
        public void setData(Integer data) {
            super.setData(data);
        }
    }
    //после стирания
    static class Node2 {
        public Object data;
        public Node2(Object data) {
            this.data = data;
        }
        public void setData(Object data) {
            this.data = data;
        }
    }
    static class IntegerNode2 extends Node2 {
        public IntegerNode2(Integer data) {
            super(data);
        }
        //субкласс не переопределяет метод
        //полиморфизм оказывается сломан
        public void setData(Integer data) {
            super.setData(data);
        }
    }

    public static void main(String[] args) {
        System.out.println("Node1:");
        Stream.of(Node1.class.getDeclaredMethods())
                .forEach(System.out::println);
        System.out.println("IntegerNode1:");
        Stream.of(IntegerNode1.class.getDeclaredMethods())
                .forEach(System.out::println);
    }
}