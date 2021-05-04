package company.model;

/**
 * Прямоугольник
 */
public class Rectangle extends Figure{
    /**
     * Высота
     */
    private float height;
    /**
     * Длина
     */
    private float width;

    public Rectangle(float height, float width) {
        setHeight(height);
        setWidth(width);
    }

    public void setHeight(float height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Высота прямоугольника должна быть > 0!");
        }
        this.height = height;
    }

    public void setWidth(float width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Длина прямоугольника должна быть > 0!");
        }
        this.width = width;
    }

    @Override
    float getArea() {
        return height * width;
    }

    @Override
    float getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Прямоугольник:");
        info
                .append("площадь=").append(getArea())
                .append(",")
                .append("периметр=").append(getPerimeter());
        return info.toString();
    }
}
