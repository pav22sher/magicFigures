package company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Figure {

    protected String getName(String name)
    {
        return name;
    }
    public LocalDateTime createdAt;
    protected int width;
    protected int heigth;
    protected int radius;
    protected double sq;
    protected int perimetr;

    public String toString(){

        StringBuilder builder = new StringBuilder();
        builder.append("Время создания:").append(createdAt.format(DateTimeFormatter.ofPattern("HH:mm:ss \t dd/MM/yyyy\t")));
        return builder.toString();
    }


}
