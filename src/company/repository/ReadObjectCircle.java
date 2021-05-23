package company.repository;

import company.model.Circle;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjectCircle {
    public static Circle read() {
        try {
            FileInputStream fis = new FileInputStream("CircleDate.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Circle circle = (Circle) ois.readObject();
            ois.close();
            return circle;
        } catch (Exception e) {
            return null;
        }
    }
}

