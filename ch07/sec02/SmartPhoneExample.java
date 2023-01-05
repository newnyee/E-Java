package e_java.ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
        System.out.println("와이파이 상태: " + myPhone.wifi);
        System.out.println();

        myPhone.bell();
        myPhone.sendVoice("어보세오.");
        myPhone.receiveVoice("안녕하세오. 저는 김진쟙니다.");
        myPhone.sendVoice("진쟈?");
        myPhone.receiveVoice("김진쟈~");
        myPhone.hangUp();
        System.out.println();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
