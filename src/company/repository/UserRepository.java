package company.repository;

import company.model.User;

import java.io.*;
import java.util.ArrayList;

/**
 * Репозитория для работы с пользователями
 */
public final class UserRepository {
    /**
     * Возвращает список пользователей.
     *
     * @return список пользователей.
     */
    public static ArrayList<User> read() {
        try {
            FileInputStream fis = new FileInputStream("Users.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<User> users = (ArrayList<User>) ois.readObject();

            ois.close();
            fis.close();
            return users;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    /**
     * Записываем пользователей в файл
     *
     * @param users пользователи
     */
    public static void write(ArrayList<User> users) {
        try {
            FileOutputStream fis = new FileOutputStream("Users.txt");
            ObjectOutputStream ois = new ObjectOutputStream(fis);

            ois.writeObject(users);

            ois.close();
            fis.close();
        } catch (Exception e) {
            return;
        }
    }
}
