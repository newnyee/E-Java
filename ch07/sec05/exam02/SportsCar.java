package e_java.ch07.sec05.exam02;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }
    /*
    @Override
    public void stop() {
       // final 메소드 오버라이딩 불가
    }
    */
}