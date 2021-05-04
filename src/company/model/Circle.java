package company.model;

/**
 * Круг
 */
public class Circle extends Figure{
    /**
     * Радиус
     */
    private float radius;

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

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Круг:");
        info
                .append("площадь=").append(getArea())
                .append(",")
                .append("периметр=").append(getPerimeter());
        return info.toString();
    }
}
