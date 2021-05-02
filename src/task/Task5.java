package task;

public class Task5 {
    public static class User {
        public boolean isActive() {
            return false;
        }
    }
    public static void main(String[] args) {
        User user = null;

        if (user != null && user.isActive()) {
            System.out.println("This user is active");
        }
        //NPE - НульПойнтЭксепшен - NullPointerException
        /*if (user != null & user.isActive()) {
            System.out.println("This user is active");
        }*/

        if (user == null || user.isActive()) {
            System.out.println("This user is empty");
        }
        //NPE - НульПойнтЭксепшен - NullPointerException
        /*if (user == null | user.isActive()) {
            System.out.println("This user is empty");
        }*/
    }
}
