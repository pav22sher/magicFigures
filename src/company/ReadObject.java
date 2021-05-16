package company;

import java.io.*;


public class ReadObject {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("UserNames.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            User user3 = (User) ois.readObject();
            User user4 = (User) ois.readObject();

            System.out.println(user3);
            System.out.println(user4);

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

