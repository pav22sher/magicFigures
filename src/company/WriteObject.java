package company;



import java.io.*;

public class WriteObject {
int id;
String userName;

   public WriteObject(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public static void main(String[] args) {
        User user3 = new User();
        User user4 = new User();
        try {
            FileOutputStream fos = new FileOutputStream("UserNames.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(user3);
            oos.writeObject(user4);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}