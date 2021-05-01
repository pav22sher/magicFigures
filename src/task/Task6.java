package task;

public class Task6 {
    public static class User {
        public boolean isActive() {
            return false;
        }
    }
    /**
     * Он упадет с NPE.
     * @param args
     */
    public static void main(String[] args) {
        User user = null;
        if (user != null && user.isActive()) {
            System.out.println("This user is active");
        }

        if (user != null & user.isActive()) {
            System.out.println("This user is active");
        }
    }
}
