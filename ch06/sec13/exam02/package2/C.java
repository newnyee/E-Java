package e_java.ch06.sec13.exam02.package2;

import e_java.ch06.sec13.exam02.package1.A;

public class C {
    A a1 = new A(true); // import 문으로 접근 가능
    // A a2 = new A(1); default 생성자 접근 불가
    // A a3 = new A("문자열"); private 생성자 접근 불가
}
