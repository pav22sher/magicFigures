package company.View;

import company.model.User;
import company.service.SecurityService;

import java.util.Scanner;

public final class SecurityView {
    public static User start(Scanner scanner) {
        int choice;
        System.out.println("Добро пожаловать пользователь!");
        do {
            System.out.println("Выберите, что вы хотите сделать:");
            System.out.println("1. Зарегистрироваться");
            System.out.println("2. Войти");
            System.out.println("3. Завершить программу");
            choice = scanner.nextInt();
            User inputUser;
            User outputUser = null;
            switch (choice) {
                case 1:
                    inputUser = getUser();
                    outputUser = SecurityService.register(inputUser);
                    break;
                case 2:
                    inputUser = getUser();
                    outputUser = SecurityService.enter(inputUser);
                    break;
                case 3:
                    System.out.println("Завершение процесса...");
                    return null;
                default:
                    System.out.println("Некорректный ввод, попробуйте еще раз");
                    break;
            }
            if (outputUser != null) {
                System.out.println("Добро пожаловать" + outputUser);
                return outputUser;
            }
        } while (true);
    }

    private static User getUser() {
        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;
        System.out.println("Заполните поля");
        System.out.println("Логин:");
        userName = scanner.nextLine();
        System.out.println("Пароль:");
        password = scanner.nextLine();
        return new User(userName,password);
    }
}