package company.model;

import java.io.Serializable;

public class User implements Serializable {
    static int count = 1;
    private final int id;
    public String userName;
    protected String password;

    public User(String userName, String password) {
        this.id = count++;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                '}';
    }
}

