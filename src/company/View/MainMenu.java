package company.View;

import java.util.Scanner;
import company.model.*;

public class MainMenu {
    public int choiceMenu;
    protected String userName;
    protected String password;

    public void MainMenu() {
        Scanner scanner = new Scanner(System.in);
        Registration reg = new Registration();
        introductionWords(scanner);
        switch (choiceMenu) {
            case 1:
                getLogin(scanner);
                getPassword(userName, scanner);
                reg.saveLogin(userName, password);
                break;
            case 2:
                getLogin(scanner);
                getPassword(userName, scanner);
                reg.checkLogin(userName, scanner);
                break;
            default:
                System.out.println("Некорректный ввод, попробуйте еще раз");
                break;
        }

    }

    private void introductionWords(Scanner scanner) {
        System.out.println("Добро пожаловать пользователь! \n Выберите, что вы хотите сделать.");
        System.out.println("1. Зарегистрироваться");
        System.out.println("2. Войти");
        choiceMenu = scanner.nextInt();
    }

    protected String getLogin(Scanner scanner) {
        System.out.println("\t Заполните поля");
        System.out.println("Логин:");
        userName = scanner.nextLine();
        return userName;                    // почему то возвращает нулл и не видит имя.... чет не понял почему
    }
    protected String getPassword(String userName, Scanner scanner){
        this.userName = userName;
        System.out.println("Пароль:");
        password = scanner.nextLine();
        return password;
    }

}