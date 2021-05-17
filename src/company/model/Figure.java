package company.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Figure {
    /**
     * Время создания
     */
    protected LocalDateTime createdAt;
    /**
     * Площадь фигуры
     */
    protected float sq;
    /**
     * Периметр фигуры
     */
    protected float perimeter;

    /**
     * Возвращает информацию об объекте
     *
     * @return информация об объекте
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String createdAtFormat = createdAt.format(DateTimeFormatter.ofPattern("HH:mm:ss \t dd/MM/yyyy\t"));
        builder.append("Время создания:").append(createdAtFormat);
        return builder.toString();
    }

    public void getResult() {
        System.out.println("Периметр равен: " + perimeter);
        System.out.println("Периметр равен: " + sq);
    }


}
