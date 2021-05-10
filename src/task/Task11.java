package task;

/**
 * Мы можем вызвать статические методы, используя переменную,
 * ссылающуюся на null. Дело в том, что статические методы
 * находятся на уровне класса. Именно поэтому мы можем вызывать статические
 * функции как при помощи самого класса, так и при помощи переменной, равной null.
 */
public class Task11 {

    public static class A{


        public static void show(){

            System.out.println("Static method called");
        }
    }
    public static void main(String[] args)  {

        A obj1 = null;
        obj1.show();
        A obj2 = new A();
        obj2.show();

    }
}
