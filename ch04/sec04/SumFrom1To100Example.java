package e_java.ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i;

        for(i=1; i<=100; i++) {
            sum += i;
        }
        // i가 101이 되었을때 for 문이 종료 되기 때문에 카운터 할때 -1을 해줘야함

        System.out.println("1~" + (i-1) + " 합: " + sum);
    }
}
