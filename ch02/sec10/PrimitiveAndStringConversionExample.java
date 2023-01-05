package e_java.ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        // 기본타입으로 변환
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean vlaue3 = Boolean.parseBoolean("true");

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(vlaue3);

        // String 타입으로 변환
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
