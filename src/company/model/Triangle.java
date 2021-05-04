package company.model;

/**
 * Треугльник
 */
public class Triangle extends Figure{
    /**
     * Сторона A
     */
    private float sideA;
    /**
     * Сторона B
     */
    private float sideB;
    /**
     * Сторона C
     */
    private float sideC;

    public Triangle(float sideA, float sideB, float sideC) {
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public void setSideA(float sideA) {
        if (sideA <= 0) {
            throw new IllegalArgumentException("Сторона треугольника должна быть > 0!");
        }
        this.sideA = sideA;
    }

    public void setSideB(float sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("Сторона квадрата должна быть > 0!");
        }
        this.sideB = sideB;
    }

    public void setSideC(float sideC) {
        if (sideC <= 0) {
            throw new IllegalArgumentException("Сторона квадрата должна быть > 0!");
        }
        this.sideC = sideC;
    }

    @Override
    float getArea() {
        //Формула Герона
        float p = getPerimeter() / 2;
        return (float) Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    float getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Треугольник:");
        info
                .append("площадь=").append(getArea())
                .append(",")
                .append("периметр=").append(getPerimeter());
        return info.toString();
    }
}