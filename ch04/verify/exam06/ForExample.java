package e_java.ch04.verify.exam06;

public class ForExample {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print("*");
                if (x==y) {
                    System.out.println();
                }
            }
        }
    }
}
