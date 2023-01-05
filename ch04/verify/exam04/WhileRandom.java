package e_java.ch04.verify.exam04;

public class WhileRandom {
    public static void main(String[] args) {
        while (true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            System.out.println("눈의 합: " + (num1 + num2));
            if(num1 + num2 == 5) {
                break;
            }
        }
        System.out.println("프로그램 종료");

    }
}
