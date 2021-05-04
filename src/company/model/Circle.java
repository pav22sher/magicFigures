package company.model;

import java.time.LocalDateTime;

/**
 * Круг
 */
public class Circle extends Figure{
    /**
     * Радиус
     */
    private float radius;
    //Блок инициализации
    {
        name = "Круг";
        createdAt = LocalDateTime.now();
    }

    public Circle(float radius) {
        setRadius(radius);
    }

    public void setRadius(float radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус круга должна быть > 0!");
        }
        this.radius = radius;
    }

    @Override
    float getArea() {
        return (float) (Math.PI * Math.pow(radius,2));
    }

    @Override
    float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }
}
