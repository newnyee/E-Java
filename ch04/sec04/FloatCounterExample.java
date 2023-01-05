package e_java.ch04.sec04;

public class FloatCounterExample {
    public static void main(String[] args) {
        for(double x=0.1; x<=1.0; x+=0.1) {
            System.out.println(x);
        }
        // 부동 소수점 방식의 실수 타입은 연산 과정에서 정확히 0.1을 표현하지 못함
    }
}
