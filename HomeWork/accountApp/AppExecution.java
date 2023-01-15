package e_java.HomeWork.accountApp;

import java.util.*;

public class AppExecution {

    List<AccountInformation> aiList = new ArrayList<>();
    Map<String, AccountInformation> aiMap = new HashMap<>();

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
                    System.out.println("----------------------");
                    System.out.println("<List Bank>");
                    System.out.println("1.계좌 생성 | 2.계좌 조회");
                    System.out.println("----------------------");
                    System.out.print("번호 선택 > ");
                    int selectNum = Integer.parseInt(scanner.nextLine());

                    if (selectNum == 1) {
                        System.out.println();
                        AccountCreation accountCreation = new AccountCreation();
                        accountCreation.addListAccount(aiList);
                    } else if (selectNum == 2) {
                        System.out.println();
                        AccountCheck accountCheck = new AccountCheck();
                        accountCheck.getListAccountCheck(aiList);
                    } else {
                        System.out.println("<1,2 중 하나의 숫자를 선택해 주세요>");
                        System.out.println();
                    }


                } else if (selectBankNum == 2) {
                    System.out.println("<Map Bank>");
                    System.out.println("-----------------------");
                    System.out.println("1.계좌 생성  | 2.계좌 조회");
                    System.out.println("-----------------------");
                    System.out.print("번호 선택 > ");
                    int selectNum = Integer.parseInt(scanner.nextLine());

                    if (selectNum == 1) {
                        System.out.println();
                        AccountCreation accountCreation = new AccountCreation();
                        accountCreation.setMapAccount(aiMap);
                    } else if (selectNum == 2) {
                        System.out.println();
                        AccountCheck accountCheck = new AccountCheck();
                        accountCheck.getMapAccountCheck(aiMap);

                    } else {
                        System.out.println("<1,2 중 하나의 숫자를 선택해 주세요>");
                        System.out.println();
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
