package company;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class User implements Serializable {
    private  String userName;
    private int id;
    static int count = 1;
    public LocalDateTime createdAt;
    StringBuilder completedString;



 public User() {
        id = count++;
        createdAt = LocalDateTime.now();
        setUserName();
        getUserName(id, userName);
        start();

    }

    public void setUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя: \n");

        userName = scanner.nextLine();

    }

    public void getUserName(int id, String userName) {
        this.id = id;
        this.userName = userName;
        if (userName.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else
            System.out.println("Добро пожаловать, пользователь № " + id + "\t" + userName);

    }

    public String toString() {

        StringBuilder builder = new StringBuilder();
        String showTime = createdAt.format(DateTimeFormatter.ofPattern("HH:mm:ss \t dd/MM/yyyy"));
        completedString = builder.append("Время создания:").append(showTime);


        return builder.toString();
    }


    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выбери фигуру");

        System.out.println("1. Квадрат\n" + "2. Прямоугольник\n" + "3. Круг\n" + "4. Треугольник\n Ваш ввод:  ");

        int caseSwitch = scanner.nextInt();
        switch (caseSwitch) {
            case 1:
                Square square = new Square();
                square.parameters();
                square.getPerimeter(square.width);
                square.getArea(square.width);
                square.drowing(square.width);
                square.outPut();
                break;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.parameters();
                rectangle.getPerimeter(rectangle.height, rectangle.width);
                rectangle.getArea(rectangle.height, rectangle.width);
                rectangle.outPut();
                break;
            case 3:
                Circle circle = new Circle();
                circle.parameters(scanner);
                circle.getPerimeter(circle.radius);
                System.out.println(circle.getArea(circle.radius));
                break;
            case 4:
                Triangle triangle = new Triangle();
                triangle.parameters();
                triangle.getPerimeter(triangle.ab, triangle.bc, triangle.ac);
                triangle.getArea(triangle.ab, triangle.bc, triangle.ac);
                triangle.outPut();
                break;
            default:
                System.out.println("Некорректный ввод, попробуйте еще раз");
                break;
        }


    }

}

