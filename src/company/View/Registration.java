package company.View;

import company.model.User;
import company.repository.ReadObject;
import company.repository.WriteObject;

import java.util.ArrayList;
import java.util.List;

public class Registration {
    static List<User> userList = new ArrayList<>();  // можно сделать через HashMap<int(id), String(userName)> или
    // <String(userName), String(password)> userList...

   // не понимаю что должен вернуть метод
    protected static void checkUserForEnter(User user1) {
        User userRead;
        while ((userRead = ReadObject.read()) != null) {
            for (User user : userList) {
                userList.add(userRead);
                if (userRead.userName.equals(user.userName))
                    System.out.println("Добро пожаловать" + user);

                else {
                    System.out.println("Пользователя с таким именем не существует, " +
                            "попробуйте зарегестрироваться");
                }
            }
        }

    }



    // тут тоже не понимаю что должен вернуть метод
    protected static void checkUserForRegistration(User user) {
        User userRead;
        while ((userRead = ReadObject.read()) != null) {
            for (User userRead : userList) { // непонимаю почему ругается idea
                userList.add(userRead);
                if (userRead.userName.equals(user.userName))
                    System.out.println("Такое имя пользователя уже существует, попробуйте еще раз");

                }
            }
        }







            // System.out.println("Логин: \t \t \t Нажмите (0) чтобы выйти в меню");

    protected static void saveUser(User user) {
        userList.add(user);
        WriteObject.write(user);
        System.out.println("Поздравляю" + user.userName + ". Вы зарегестрированы.");

    }


    /*  ТУТ ХОТЕЛ СОЗДАТЬ МЕТОД ДЛЯ ВЫХОДА ИЗ ПРОГРАММЫ
        private void exit() {
    System.exit(0); }
     */

}


