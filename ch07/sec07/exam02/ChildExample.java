package e_java.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child; // 자동 타입 변환

        parent.method1();
        parent.method2();
        // parent.method3(); // 호출 불가
    }
}
