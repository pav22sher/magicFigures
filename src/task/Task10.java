package task;

/**
 * Каждый раз, когда мы создаем объект какого-либо класса,
 * первым вызывается конструктор и выделяется память для всех нестатических переменных.
 * Здесь B b = new B(); объекту класса B присваивается новый объект того же класса.
 * Запись B b = new B(); приводит к рекурсивному исполнению конструктора,
 * что создает бесконечные объекты.
 */
public class Task10 {

    public static class B {

        B b = new B();

        public void show(){
            System.out.println("Show msg!");
        }
    }

    public static void main(String[] args)  {

        B b = new B();
        b.show();
    }
}
