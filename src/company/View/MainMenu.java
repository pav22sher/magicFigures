package company.View;

import java.util.Scanner;
import company.model.*;

public class MainMenu {
    public int choiceMenu;


    public void mainMenuStart() {
        Scanner scanner = new Scanner(System.in);
        Registration reg = new Registration();
        System.out.println("Добро пожаловать пользователь! \n Выберите, что вы хотите сделать.");
        System.out.println("\n1. Зарегистрироваться" + "\n2. Войти");   choiceMenu = scanner.nextInt();

        switch (choiceMenu) {
            case 1:
                User user = getUser(scanner);
                Registration.checkUserForRegistration(user);
                Registration.saveUser(user);
                break;
            case 2:
                User user1 = getUser(scanner);
                Registration.checkUserForEnter(user1);
                break;
            default:
                System.out.println("Некорректный ввод, попробуйте еще раз");
                break;
        }

    }

    private User getUser(Scanner scanner) {
        String userName;
        String password;
        userName = scanner.nextLine();
        getLogin(scanner);

        getPassword(scanner);
        password = scanner.nextLine();

        return new User(userName, password);
    }


    protected String getLogin(Scanner scanner) {
        System.out.println("\t Заполните поля");
        System.out.println("Логин:");
        return scanner.nextLine();

    }
    protected String getPassword(Scanner scanner){
        System.out.println("Пароль:");
        return scanner.nextLine();
    }

}