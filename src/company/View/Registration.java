package company.View;

import company.model.User;
import company.repository.ReadObject;
import company.repository.WriteObject;

import java.util.Scanner;

public class Registration {
    String userName;
    String password;

    protected String checkLogin(String userName, Scanner scanner) {
        this.userName = userName;
        User userRead = ReadObject.read();
        while (userRead.userName != userName) {
            System.out.println("Пользователя с таким именем не существует, попробуйте еще раз");
            System.out.println("Логин: \t \t \t Нажмите (0) чтобы выйти");

            userName = scanner.nextLine();
            return userName;
        }
        System.out.println("Пароль:");
        password = scanner.nextLine();
        while (password == password) {
            System.out.println("Пароль неверный, попробуйте еще раз");
            System.out.println("Логин: \t \t \t Нажмите (0) чтобы выйти");
            password = scanner.nextLine();
            return password;

        }
        return userName;
    }


    protected void saveLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
        User userWrite = new User(userName, password);
        WriteObject.write(userWrite);
        System.out.println("Добро пожаловать" + userName);


    }

    /*  ТУТ ХОТЕЛ СОЗДАТЬ МЕТОД ДЛЯ ВЫХОДА ИЗ ПРОГРАММЫ
        private void exit() {
    System.exit(0); }
     */

}


