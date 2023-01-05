package e_java.ch07.sec11;

public sealed class Manager extends Person permits Director {
    @Override
    public void work() {
        System.out.println("생산 관리를 합니다.");
    }
}
