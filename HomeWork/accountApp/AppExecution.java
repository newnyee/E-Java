package e_java.HomeWork.accountApp;

import java.util.Scanner;

public class AppExecution {

    public void executionMethod () {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        try {
            while (run) {

                System.out.println("------------------------------------");
                System.out.println("1.List Bank | 2.Map Bank | 3.종료");
                System.out.println("------------------------------------");
                System.out.print("은행번호를 선택하세요 > ");
                int selectBankNum = Integer.parseInt(scanner.nextLine());
                System.out.println();


                if (selectBankNum == 1) {
                    System.out.println("---------------------------------");
                    System.out.println("<List Bank>");
                    System.out.println("1. List 계좌생성 | 2. List 계좌조회");
                    System.out.println("---------------------------------");
                    System.out.print("번호 선택 > ");
                    int selectNum = Integer.parseInt(scanner.nextLine());

                    if (selectNum == 1) {
                        System.out.println();
                        AccountCreation accountCreation = new AccountCreation();
                        accountCreation.setListAccount();
                    }



                } else if (selectBankNum == 2) {
                    System.out.println("<Map Bank>");
                    System.out.println("--------------------------------");
                    System.out.println("1. Map 계좌생성  | 2. Map 계좌조회");
                    System.out.println("--------------------------------");
                    System.out.print("번호 선택 > ");
                    int selectNum = Integer.parseInt(scanner.nextLine());

                    if (selectNum == 1) {
                        System.out.println();
                        AccountCreation accountCreation = new AccountCreation();
                        accountCreation.setMapAccount();
                    }



                } else if (selectBankNum == 3) {
                    System.out.println("<프로그램을 종료합니다>");
                    run = false;
                } else {
                    System.out.println("<1~3 사이의 숫자를 선택해 주세요>");
                    System.out.println();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("<1~3 사이의 숫자를 입력해 주세요>");
            System.out.println();
            executionMethod();
        }
    }


}
