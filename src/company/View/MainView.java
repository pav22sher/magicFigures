package company.View;

import company.service.MainService;

import java.util.Scanner;

public final class MainView {
    public static void start(Scanner scanner) {
        int choice;
        do {
            System.out.println("Выбери фигуру");
            System.out.println("1. Квадрат");
            System.out.println("2. Прямоугольник");
            System.out.println("3. Круг");
            System.out.println("4. Треугольник");
            System.out.println();
            System.out.println("5. Выйти");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    MainService.createSquare(scanner);
                    break;
                case 2:
                    MainService.createRectangle(scanner);
                    break;
                case 3:
                    MainService.createCircle(scanner);
                    break;
                case 4:
                    MainService.createTriangle(scanner);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Некорректный ввод, попробуйте еще раз");
                    break;
            }
        } while (true);
    }

}
