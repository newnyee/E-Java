package e_java.HomeWork.accountApp;

import java.util.*;

public class AccountCreation {

    public void addListAccount(List<AccountInformation> aiList) {

        System.out.println("------------");
        System.out.println("계좌 생성");
        System.out.println("------------");

        AccountInformation ai = new AccountInformation();
        Scanner scanner = new Scanner(System.in);


        System.out.print("계좌번호: ");
        ai.setAcnNum(scanner.nextLine());
        System.out.print("예금주: ");
        ai.setOwner(scanner.nextLine());
        System.out.print("초기 입금액: ");
        ai.setBalance(Integer.parseInt(scanner.nextLine()));

        aiList.add(ai);


        System.out.println(aiList.size());
        System.out.println("<계좌 생성 완료>");
        System.out.println();
    }


    public void setMapAccount(Map<String, AccountInformation> aiMap) {
        System.out.println("------------");
        System.out.println("계좌 생성");
        System.out.println("------------");

        AccountInformation ai = new AccountInformation();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("계좌번호: ");
            String acnNum = scanner.nextLine();

            if (aiMap.containsKey(acnNum)) {
                System.out.println("<이미 생성된 계좌번호 입니다. 다른 계좌번호를 입력해주세요.>");
                System.out.println();
            } else {
                ai.setAcnNum(acnNum);
                break;
            }
        }
        System.out.print("예금주: ");
        ai.setOwner(scanner.nextLine());
        System.out.print("초기 입금액: ");
        ai.setBalance(Integer.parseInt(scanner.nextLine()));

        aiMap.put(ai.getAcnNum(), ai);
        System.out.println("<계좌 생성 완료>");
        System.out.println();
    }
}
