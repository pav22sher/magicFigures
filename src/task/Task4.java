package task;

import java.time.LocalDateTime;

public class Task4 {
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p);//Посмотреть на значения по умолчанию

        System.out.println();

        p = new Point(1,2);
        System.out.println(p);//Посмотреть на значения по умолчанию
    }

    private static class Point{
        private static String title;
        static { //прочитать про статический блок инициализации
            title = "Значение по умолчанию для статического поля";
        }

        public static String getTitle() {
            return title;
        }

        private int x;
        private double y;
        private float z;
        private LocalDateTime t;
        private String comment = "Значение по умолчанию";
        private String author;

        public Point() {
            author = "аноним";
        }

        public Point(int x, double y) {
            this.x = x;
            this.y = y;
        }

        public Point(int x, double y, float z) {
            this(x, y);//другой конструктор должен быть вызван первым
            this.z = z;
            //this(x, y);//так нельзя делать
        }

        public Point(int x, double y, float z, LocalDateTime t) {
            this(x,y,z);
            this.t = t;
        }

        @Override
        public String toString() {
            return getTitle()+//обратиться к статическому методу из нестатического можно, а наоборот нельзя!
                    "\nPoint{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    ", t=" + t +
                    ", comment='" + comment + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }
    }
}
