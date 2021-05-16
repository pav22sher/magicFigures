package company.repository;

import company.model.User;

import java.io.*;

public class WriteObject {
    public static void write(User user) {
        try {
            FileOutputStream fos = new FileOutputStream("UserNames.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.close();
        } catch (Exception e) {
            return;
        }
    }
}