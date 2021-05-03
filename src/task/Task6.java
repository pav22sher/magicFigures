package task;

public class Task6 {
    private static class Point2D{
        protected int x;
        protected int y;

        public Point2D(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void displayInfo(){
            System.out.println("Информация о точке:"+this);
        }

        @Override
        public String toString() {
            return "Point2D{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        static double getDistanceBetweenTwoPoints(Point2D point1, Point2D point2){
            if(point1 == null || point2 == null){
                throw new NullPointerException("Невозможно рассчитать расстояние между точками, так как одна из точек не была задана!");
            }
            return Math.sqrt(Math.pow(point1.x-point2.x,2)+Math.pow(point1.y-point2.y,2));
        }
    }
    private static class Point3D extends Point2D{
        private int z;

        public Point3D(int x, int y, int z) {
            super(x, y);//родительский конструетор должен быть первым вызаван в дочернем классе
            this.z = z;
            //super(x, y); так нельзя
        }

        @Override
        public void displayInfo() {
            System.out.println("Точка");
            super.displayInfo();//Пример вызава родительского метода (он может вызываться и не первым)
        }

        @Override
        public String toString() {
            return "Point3D{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
        }

        //Статический метод для рассчета растояния между точками
        static double getDistanceBetweenTwoPoints(Point3D point1, Point3D point2){
            if(point1 == null || point2 == null){
                throw new NullPointerException("Невозможно рассчитать расстояние между точками, так как одна из точек не была задана!");
            }
            return Math.sqrt(Math.pow(point1.x-point2.x,2)+Math.pow(point1.y-point2.y,2)+Math.pow(point1.z-point2.z,2));
        }
    }

    public static void main(String[] args) {
        System.out.println("Использование ключевого слова super");

        Point2D point2D = new Point2D(1,2);
        point2D.displayInfo();

        Point3D point3D = new Point3D(3,4,5);
        point3D.displayInfo();

        System.out.println("Использование статических методов");

        Point2D point2D1 = new Point2D(10,10);
        Point2D point2D2 = new Point2D(4,2);
        System.out.println(Point2D.getDistanceBetweenTwoPoints(point2D1,point2D2));

        Point2D point3D1 = new Point3D(0, -3, 3);
        Point2D point3D2 = new Point3D(3, 1, 3);
        System.out.println(Point3D.getDistanceBetweenTwoPoints(point3D1,point3D2));
    }
}
