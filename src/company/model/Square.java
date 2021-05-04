package company.model;

/**
 * Квадрат
 */
public class Square extends Figure{
    /**
     * Сторона
     */
    private float side;

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

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Квадрат:");
        info
                .append("площадь=").append(getArea())
                .append(",")
                .append("периметр=").append(getPerimeter());
        return info.toString();
    }
}
