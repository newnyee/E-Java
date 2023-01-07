package e_java.HomeWork.accountApp;

public class Account {
    private String acnNum;
    private String owner;
    private int balance;


    public Account() {

    }

    public void setAcnNum(String acnNum) {this.acnNum = acnNum;}
    public void setOwner(String owner) {this.owner = owner;}
    public void setBalance(int balance) {this.balance = balance;}


    public String getAcnNum() {return acnNum;}
    public String getOwner() {return owner;}
    public int getBalance() {return balance;}
}
