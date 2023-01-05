package e_java.ch04.verify.exam07;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int money = 0;

        while(run) {
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");
            System.out.print("선택> ");
            int inputData = scanner.nextInt();

            switch (inputData) {
                case 1:
                    System.out.print("예금액> ");
                    money += scanner.nextInt();
                    System.out.println();
                    break;

                case 2:
                    System.out.print("출금액> ");
                    money -= scanner.nextInt();
                    System.out.println();
                    break;

                case 3:
                    System.out.println("잔고> " + money);
                    System.out.println();
                    break;

                default:
                    System.out.println();
                    System.out.println("프로그램 종료");
                    run = false;


            }
        }
    }
}
