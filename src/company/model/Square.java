package company.model;

import java.time.LocalDateTime;

/**
 * Квадрат
 */
public class Square extends Figure{
    /**
     * Сторона
     */
    private float side;
    //Блок инициализации
    {
        name = "Квадрат";
        createdAt = LocalDateTime.now();
    }

    public Square(float side) {
        setSide(side);
    }

    public void setSide(float side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Сторона квадрата должна быть > 0!");
        }
        this.side = side;
    }

    @Override
    float getArea() {
        return (float) Math.pow(side, 2);
    }

    @Override
    float getPerimeter() {
        return 4 * side;
    }
}
