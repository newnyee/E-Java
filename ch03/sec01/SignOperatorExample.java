package e_java.ch03.sec01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        x = -x;
        System.out.println("x: " + x);

        byte b = 100;
        int y = -b;
        System.out.println("y: " + y);

        byte c = 50;
        byte d = (byte) -c;
        byte e = c;
        System.out.println(d + ", " + e);


    }
}
