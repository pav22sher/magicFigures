package task;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    /**
     * Метод load Db получает значение переменной emails.
     * Дальше это значение перезаписывается новым объектом.
     * В новый объект добавляются данные.
     * После того, как метод завершен созданный объект уничтожается.
     *
     * Метод loadMem получает значение переменной emails.
     * В этот объект добавляет новое значение.
     * После того, как метод завершился данные остаются в ранее
     * проинициализированном объекте emails. Поэтому на консоле мы видим,
     * что этот метод повлиял на переменную emails.
     * @param args
     */
    public static void main(String[] args) {
        List emails = new ArrayList();
        loadDb(emails);
        System.out.println("Load from db: " + emails);
        loadMem(emails);
        System.out.println("Load from mem: " + emails);
    }

    public static void loadDb(List data) {
        data = new ArrayList<>();
        data.add("parsentev@yandex.ru");
    }

    public static void loadMem(List data) {
        data.add("ivanov@yandex.ru");
    }
}
