package task;

public class Task3 {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        System.out.println(p);
        change(p);
        System.out.println(p);
        //при выводе мы видем значение z=0, хотя мы его не присваевали
        //Д/З
        //Узнать какие значения присваеваются остальным примитивным типам данных по умалчанию?
        //Узнать какое значения присваевается объектам по умалчанию?
    }

    private static void change(Point p){
        //p = new Point();
        p.setX(3);
        p.setY(4);
    }

    private static class Point{
        private int x,y,z;

        public Point() {
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point(int x, int y, int z) {
            this(x, y);
            this.z = z;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
        }
    }
}
