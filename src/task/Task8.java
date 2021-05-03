package task;

public class Task8 {
    public interface Interface1 {

        default void method1(){
            System.out.println("M1");
        };

        default void log(String str){
            System.out.println("Метод1 по умолчанию. Логгируем: " + str);
        }
    }

    public interface Interface2 {

        default void method2(){
            System.out.println("M2");
        };

        default void log(String str) {
            System.out.println("Метод2 по умолчанию. Логгируем: " + str);
        }
    }

    /**
     * Мы знаем, что Java не позволяет нам наследоваться от нескольких классов,
     * потому что это приведет к ромбовидной проблеме, где компилятор не может решить,
     * какой метод суперкласса использовать. Теперь же с появлением методов по умолчанию,
     * эта проблема возникнет и для интерфейсов!
     *
     * Все дело в том, что если класс реализует как Interface1, так и Interface2
     * и не реализовывает общий метод по умолчанию, то компилятор не может решить что выбрать.
     *
     * Так что, если класс реализует оба вышеуказанных интерфейса,
     * то он должен будет обеспечить реализацию метода log(String str),
     * в противном случае компилятор будет бросать ошибки.
     */
    public static class MyClass implements Interface1, Interface2 {
        @Override
        public void log(String str) {
            Interface1.super.log(str);
            Interface2.super.log(str);
        }
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method1();
        myClass.method2();
        myClass.log("Hello world!");
    }
}
