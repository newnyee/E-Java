package e_java.ch07.verify.exam07;

public class Child extends Parent {
    public String name;

    public Child() {  //2
        this("홍길동");  //3
        System.out.println("Child() call"); //14
    }

    public Child(String name) {  //4
        // super(); 컴파일러 자동 생성  //5
        this.name = name;  //12
        System.out.println("Child(String name) call");  //13
    }
}