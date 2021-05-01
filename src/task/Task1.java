package task;

public class Task1 {
    /**
     * Программа напечатает “num1 == num2”.
     * Если мы сравниваем две ссылки на объекты с помощью ==,
     * значение всегда будет «false». Но в этом примере переменные num1 и num2
     * автоупаковываются (autoboxing) из-за Integer-кэширования.
     * Вот почему num1 == num2 возвращает значение «true».
     * Не забудьте, что Integer-кэширование актуально только для значений от -128 до 127.
     * @param args
     */
    public static void main(String[] args) {
        Integer num1 = 100;
        Integer num2 = 100;

        if(num1==num2){
            System.out.println("num1 == num2");
        }
        else{
            System.out.println("num1 != num2");
        }
    }
}
