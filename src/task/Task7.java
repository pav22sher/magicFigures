package task;

public class Task7 {
    private static void change(String str){
        str += "World!";
    }
    private static void change(StringBuilder str){
        str.append("World!");
    }
    public static void main(String[] args) {
        String str1 = "Hello";
        change(str1);
        System.out.println(str1);

        StringBuilder str2 = new StringBuilder("Hello");
        change(str2);
        System.out.println(str2);
    }
}
