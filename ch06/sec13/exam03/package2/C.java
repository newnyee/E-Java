package e_java.ch06.sec13.exam03.package2;

import e_java.ch06.sec13.exam03.package1.A;

public class C {
    public C() {
        A a = new A();

        a.field1 = 1; // import문 이용하여 접근 가능
        // a.field2 = 2; default 필드 접근 불가
        // a.field3 = 3; private 필드 접근 불가

        a.method1(); // import문 이용하여 접근 가능
        // a.method2(); default 메소드 접근 불가
        // a.method3(); private 메소드 접근 불가
    }
}
