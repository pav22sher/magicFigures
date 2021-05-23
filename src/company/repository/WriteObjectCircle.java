package company.repository;

import company.model.Circle;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjectCircle {
    public static void write(Circle circle) {
        try {
            FileOutputStream fos = new FileOutputStream("CircleDate.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(circle);
            oos.close();
        } catch (Exception e) {
            return;
        }
    }
}