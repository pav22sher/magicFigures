package company.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Абстрактная фигура
 */
public abstract class Figure {
    /**
     * Название
     */
    protected String name;
    /**
     * Время создания
     */
    protected LocalDateTime createdAt;
    /**
     * @return площадь фигуры.
     */
    abstract float getArea();

    /**
     * @return периметр фигуры.
     */
    abstract float getPerimeter();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(name);
        builder
                .append("(")
                .append("Периметр=").append(String.format("%.2f", getPerimeter()))
                .append(", ")
                .append("Площадь=").append(String.format("%.2f",getArea()))
                .append(")")
                .append(", ")
                .append("Время создания:").append(createdAt.format(DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy")));
        return builder.toString();
    }
}
