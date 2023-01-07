package e_java.HomeWork.accountApp;

import java.util.*;

import static e_java.HomeWork.accountApp.BankApplication.accountList;
import static e_java.HomeWork.accountApp.BankApplication.accountMap;

public class AccountCreation {

    public void setListAccount() {
        System.out.println("----------");
        System.out.println("계좌생성");
        System.out.println("----------");

        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        System.out.print("계좌번호: ");
        account.setAcnNum(scanner.nextLine());
        System.out.print("예금주: ");
        account.setOwner(scanner.nextLine());
        System.out.print("초기 입금액: ");
        account.setBalance(Integer.parseInt(scanner.nextLine()));

        for(int i=0; i<accountList.size(); i++) {
            if(accountList.get(i) == null) {
                accountList.set(i, account);
                break;
            }
        }
        System.out.println("<계좌 생성 완료>");
        System.out.println();
    }


    public void setMapAccount() {
        System.out.println("----------");
        System.out.println("계좌생성");
        System.out.println("----------");

        Account account = new Account();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("계좌번호: ");
            String acnNum = scanner.nextLine();
            if (accountMap.containsKey(acnNum)) {
                System.out.println("<이미 생성된 계좌번호 입니다. 다른 계좌번호를 입력해주세요.>");
                System.out.println();
            } else {
                account.setAcnNum(acnNum);
                break;
            }
        }
        System.out.print("예금주: ");
        account.setOwner(scanner.nextLine());
        System.out.print("초기 입금액: ");
        account.setBalance(Integer.parseInt(scanner.nextLine()));

        accountMap.put(account.getAcnNum(), account);
        System.out.println("<계좌 생성 완료>");
        System.out.println();
    }
}
