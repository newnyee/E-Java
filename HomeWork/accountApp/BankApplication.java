package e_java.HomeWork.accountApp;

import java.util.*;

public class BankApplication {
    static List<AccountInformation> accountInformationList = new ArrayList<>();
    static Map<String, AccountInformation> accountMap = new HashMap<>();

    public static void main(String[] args) {
        AppExecution ae = new AppExecution();
        ae.executionMethod();
    }
}
