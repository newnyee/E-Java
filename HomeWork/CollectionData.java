package e_java.HomeWork;

import e_java.ch06.verify.exam20.Account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionData {
        /*
    배열이란.
    a, b, c가 string값일 경우 3가지 값이 들어간 배열 -> [a, b, c]
    Account(type)는 ano : 계좌번호, owner : 계좌주, balance : 예금액 을
    하나의 객체로 묶은 것임

    [ (ano, owner, balance),
    [ A, B, C ]


    Account[] accountArray = new Account[100];
    [ (ano, owner, balance), (ano, owner, balance), (ano, owner, balance), ... , (ano, owner, balance)]

    List<Account> showAccount = new ArrayList<>();
    [ (ano, owner, balance), (ano, owner, balance), (ano, owner, balance), ... ]

    showAccount.add(A); => 배열의 길이는 1개
    accountArray.length

    showAccount.add(B); => 배열의 길이는 2개
    accountArray.length

    List<String> a = new ArrayList<>();

    List<> b = new ArrayList<>();

    Map<String, Car> showAccountMap = new HashMap<>();
    가변배열 흥


    Map = [(key, {Account}), (key, {Account})]
    [ (ano1, {1002, 야야, 10억}), (ano3, {7777, 홍야, 100000억}), (ano2, {1002, 야야, 10억}) ]


    String = 46구 1735;
    Car = 쉐보레크루즈, 빨강, 타이어가 4개인차;


    List = [(Account),(Account)]
    [ (1002, 야야, 10억), (1002, 야야, 10억) ]



     */

    /*
    숫제 
    
    List, Map에 배열길이 5개로 자료 넣어보고,
    리스트는 한꺼번에 출력되게
    맵은 5개중 하나 입력해서 찾을 수 있게.
    
    형식은 자유롭게 해주세오!!!!! 야야
    
     */
    
    

    public static List<Account> getAccount(String abc) {
        List<Account> sunhwaList = new ArrayList<>();
        Account sunhwaAccount = new Account();

        sunhwaAccount.setOwner(abc);
        sunhwaAccount.setAno("1002-049-013111");
        sunhwaAccount.setBalance(10);

        sunhwaList.add(sunhwaAccount);

        return sunhwaList;
    }

    public static Map<String, Account> getAccountMap(String abc) {
        Map<String, Account> sunhwaMap = new HashMap<>();
        Account sunhwaAccount = new Account();

        sunhwaAccount.setOwner(abc);
        sunhwaAccount.setAno("1002-049-013111");
        sunhwaAccount.setBalance(10);

        sunhwaMap.put(abc, sunhwaAccount);

        return sunhwaMap;
    }

    public static void main(String[] args) {
        List<Account> newList = new ArrayList<>();
        newList = getAccount("bc");
        Account AccountSunhwaInfo = getAccount("bc").get(0);

        System.out.println(
                AccountSunhwaInfo.getAno()
                        +","+
                        AccountSunhwaInfo.getBalance()
                        +","+
                        AccountSunhwaInfo.getOwner()
        );

        Account AccountSunhwaInfo1 = getAccountMap("bc").get("선화개인정보");
        System.out.println(

                AccountSunhwaInfo1.getOwner()
                        +","+
                        AccountSunhwaInfo1.getBalance()
                        +","+
                        AccountSunhwaInfo1.getAno()
        );
    }


}
