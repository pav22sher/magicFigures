package company.repository;

import company.model.User;

import java.io.*;

public class WriteObject {
    public static void write(User user) {
        try {
            FileOutputStream fos = new FileOutputStream("UserNames.txt"); // еще не нашел в интернете как раскодировать текст
            // который записывает информацию в файл userNames
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.close();
        } catch (Exception e) {
            return;
        }
    }
}