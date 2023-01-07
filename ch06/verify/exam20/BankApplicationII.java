package e_java.ch06.verify.exam20;

import java.util.Scanner;

public class BankApplicationII {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {//메인 메소드
        bankApp();
    }

    public static void bankApp() {
        boolean run = true;
        try {
            while (run) {
                System.out.println("-----------------------------------------------");
                System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
                System.out.println("-----------------------------------------------");
                System.out.print("선택> ");
                int selecNum = Integer.parseInt(scanner.nextLine());

                if (selecNum == 1) {
                    System.out.println("----------");
                    System.out.println("계좌생성");
                    System.out.println("----------");
                    creatAccount();
                } else if (selecNum == 2) {
                    System.out.println("----------");
                    System.out.println("계좌목록");
                    System.out.println("----------");
                    accountList();
                } else if (selecNum == 3) {
                    System.out.println("----------");
                    System.out.println("예금");
                    System.out.println("----------");
                    deposit();
                } else if (selecNum == 4) {
                    System.out.println("----------");
                    System.out.println("출금");
                    System.out.println("----------");
                    withdraw();
                } else {
                    System.out.println("프로그램 종료");
                    run = false;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("번호를 다시 눌러주세요");
            bankApp();
        }
    }

    //1.계좌생성
    private static void creatAccount() {
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("계좌주: ");
        String owner = scanner.nextLine();
        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        Account newAccount = new Account(ano, owner, balance);
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            } else if (accountArray[i].getAno().equals(ano)) {
                System.out.println("같은 계좌번호가 존재합니다. 다른 계좌번호를 입력해 주세요.");
                creatAccount();
                break;
            }
        }
    }

    private static void accountList() {
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                System.out.print(accountArray[i].getAno());
                System.out.print("   ");
                System.out.print(accountArray[i].getOwner());
                System.out.print("   ");
                System.out.println(accountArray[i].getBalance());
            }
        }
    }

    private static void deposit() {
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("예금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i].getAno().equals(ano)) {
                accountArray[i].setBalance(accountArray[i].getBalance() + money);
                System.out.println("결과: 입금이 완료되었습니다.");
                break;
            }
        }
    }

    private static void withdraw() {
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("출금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i].getAno().equals(ano)) {
                accountArray[i].setBalance(accountArray[i].getBalance() - money);
                System.out.println("결과: 출금이 완료되었습니다.");
                break;
            }
        }
    }
}
