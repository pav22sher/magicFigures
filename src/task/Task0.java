package task;

public class Task0 {
    /**
     * Программа напечатает “String method”.
     * Прежде всего стоит отметить, что null не является объектом в Java.
     * Но null можно присвоить любой ссылке.
     * Java String является объектом класса java.lang.String.
     * В этой программе компилятор Java выбирает вызов перегруженного метода
     * с наиболее конкретными параметрами. Это будет String, потому что класс
     * String более конкретен, чем класс Object.
     * @param args
     */
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object o) {
        System.out.println("Object method");
    }
    public static void method(String s) {
        System.out.println("String method");
    }
}
