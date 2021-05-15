package company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//TODO: изменить тип на float полей width, heigth, radius
//TODO: оставить в этом классе поля createdAt, sq, perimetr
//TODO: сначало указываются поля,а потом методы (метод getName переместить в конец)
//TODO: Прочитай про javadoc
public class Figure { //TODO: сделать класс абстрактным

    protected String getName(String name)
    {
        return name;
    }
    public LocalDateTime createdAt;//TODO: сделать поля protected
    protected int width; //TODO: вынести в класс прямоугольника
    protected int heigth; //TODO: вынести в класс прямоугольника и переименовать height
    protected int radius; //TODO: вынести в класс окружности
    protected double sq;
    protected int perimetr; //TODO: переименовать на perimeter

    public String toString(){

        StringBuilder builder = new StringBuilder();
        builder.append("Время создания:").append(createdAt.format(DateTimeFormatter.ofPattern("HH:mm:ss \t dd/MM/yyyy\t")));
        return builder.toString();
    }


}
