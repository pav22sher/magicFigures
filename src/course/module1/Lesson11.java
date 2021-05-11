package course.module1;

import java.util.Scanner;

/**
 * Урок11: Исключения:
 *
 * checked - проверяемые исключения происходят от класса Exception!
 * (являются следствием ошибок работы программы и обрабатываются программистом)
 *
 * unchecked - НЕпроверяемые исключения происходят от класса RuntimeException!
 * (являются следствием ошибок программиста и не обрабатываются программистом)
 *
 * можно создавать собственные исключения(обычно проверяймые исключения)!
 */
public class Lesson11 {
    public static class AgeLessThanZeroException extends Exception {
        public AgeLessThanZeroException(String message) {
            super(message);
        }
    }

    public static void main (String args[]) {
        try{
            inputProcess();
        }catch (AgeLessThanZeroException e){
            System.out.println(e.getMessage());
        }

    }

    private static void inputProcess() throws AgeLessThanZeroException {
        Scanner input = new Scanner(System.in);
        System.out.println("Ваш возраст:");
        int age = input.nextInt();
        if(age <=0){
            throw new AgeLessThanZeroException("Возраст человека должен быть >= 0!");
        }
    }
}
