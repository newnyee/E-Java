package e_java.HomeWork.accountApp;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AccountCheck {

    public void getListAccountCheck(List<AccountInformation> aiList) {
        System.out.println("------------");
        System.out.println("계좌 정보 조회");
        System.out.println("------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("계좌번호입력: ");
        String accountNum = scanner.nextLine();


        for (int i=0; i<aiList.size(); i++) {
            AccountInformation ai = aiList.get(i);
            if (ai.getAcnNum().equals(accountNum)) {
                System.out.println("계좌주: " + ai.getOwner());
                System.out.println("잔금: " + ai.getBalance());
                System.out.println();
                break;
            }
        }
    }


    public void getMapAccountCheck(Map<String, AccountInformation> aiMap) {
        System.out.println("----------");
        System.out.println("계좌 조회");
        System.out.println("----------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("계좌번호입력: ");
        String accountNum = scanner.nextLine();

        AccountInformation ai = aiMap.get(accountNum);
        System.out.println("계좌주: " + ai.getOwner());
        System.out.println("잔금: " + ai.getBalance());
        System.out.println();
    }
}
