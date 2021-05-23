package company.service;

import company.model.User;
import company.repository.UserRepository;

import java.util.ArrayList;

public final class SecurityService {

    /**
     * Вход пользователя в систему
     * @param inputUser пользователь
     * @return пользователь
     */
    public static User enter(User inputUser) {
        ArrayList<User> users = UserRepository.read();
        for(User tmp: users){
            if (tmp.equals(inputUser)){
                return inputUser;
            }
        }
        System.out.println("Ошибка: Пользователя с таким логином и поролем нет!");
        System.out.println("Совет: Попробуйте зарегестрироваться!");
        return null;
    }

    /**
     * Регистрация пользователя в системе
     * @param inputUser пользователь
     * @return пользователь
     */
    public static User register(User inputUser) {
        ArrayList<User> users = UserRepository.read();
        for(User tmp: users){
            if (tmp.userName.equals(inputUser.userName)){
                System.out.println("Ошибка: Пользователь с таким логином уже существует!");
                System.out.println("Совет: Придумайти другой логин и попробуйте сново!");
                return null;
            }
        }
        users.add(inputUser);
        UserRepository.write(users);
        return inputUser;
    }
}


