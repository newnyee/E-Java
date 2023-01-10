package e_java.ch08.sec11.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);  // Vehicle 타입으로 자동타입 변환 → 오버라이딩 된 메소드 호출
        driver.drive(taxi); // Vehicle 타입으로 자동타입 변환 → 오버라이딩 된 메소드 호출
    }
}
