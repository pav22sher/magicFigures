package task;


public class Task12 {
    public static void main(String[] args)  {
        //-128 <= i <= 127
        Integer i1 = -128;
        Integer i2 = -128;
        System.out.println(i1 == i2);
        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);
        //-128 > i > 127
        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);
        Integer i7 = -129;
        Integer i8 = -129;
        System.out.println(i7 == i8);
    }
}
