package company.repository;

import company.model.User;

import java.io.*;

public class ReadObject {
    public static User read() {
        try {
            FileInputStream fis = new FileInputStream("UserNames.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            User user = (User) ois.readObject();
            ois.close();
            return user;
        } catch (Exception e) {
            return null;
        }
    }
}

