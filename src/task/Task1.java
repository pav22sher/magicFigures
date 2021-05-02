package task;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");

        System.out.println("str1 == str2 " + (str1==str2));
        System.out.println("str1 equals str2 " + (str1.equals(str2)));

        System.out.println();

        System.out.println("str1 == str3 " + (str1==str3));
        System.out.println("str1 equals str3 " + (str1.equals(str3)));

        System.out.println();

        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = new Integer(100);

        System.out.println("num1 == num2 " + (num1==num2));
        System.out.println("num1 equals num2 " + (num1.equals(num2)));

        System.out.println();

        System.out.println("num1 == num3 " + (num1==num3));
        System.out.println("num1 equals num3 " + (num1.equals(num3)));
    }
}
