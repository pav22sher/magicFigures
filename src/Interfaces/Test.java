package Interfaces;

public class Test {
    public static void main(String[] args) {
        A obj1 = null;
        obj1.show();
        A obj2 = new A();
        obj2.show();



        int i1 = -128;
        int i2 = -128;
        System.out.println(i1 == i2);

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);
        //-128 > i > 127
        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);
    }
    public static class A{


        public static void show(){

            System.out.println("Static method called");
        }
    }

}
