package company.model;

import java.io.Serializable;

public class User implements Serializable {
    static int count = 1;
    public String userName;
    private final int id;

    public User(String userName)
    {
        this.id = count++;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                '}';
    }
}

