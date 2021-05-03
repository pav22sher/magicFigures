package task;

public class Task9 {
    enum Day{

        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресение");

        private final String ruName;

        Day(String ruName) {
            this.ruName = ruName;
        }

        @Override
        public String toString() {
            return "Day{" +
                    "name=" + name() +
                    ", ruName=" + ruName +
                    '}';
        }
    }

    public static void main(String[] args) {
        System.out.println("Пример работы с перечислениями");
        for (Day day : Day.values()){
            System.out.println(day);
        }
    }
}
