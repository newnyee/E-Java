package e_java.ch07.verify.exam07;

public class Parent {
    public String nation;

    public Parent() { //6
        this("대한민국"); //7
        System.out.println("Parent() call"); //11
    }

    public Parent(String nation) {  //8
        this.nation = nation;  //9
        System.out.println("Parent(String nation) call"); //10
    }
}