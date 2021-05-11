package course.module1;

/**
 * Урок7: return
 */
public class Lesson7 {
    public static void main (String args[]){
        display(null);
        display("Hello world");
    }

    static void display(Object obj){
        if(obj == null)
            return;//досрочный выход из метода
        System.out.println(obj.toString());
    }
}
