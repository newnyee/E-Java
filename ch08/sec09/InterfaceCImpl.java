package e_java.ch08.sec09;

public class InterfaceCImpl implements InterfaceC{
    @Override
    public void methodA() {
        System.out.println("InterfaceCImpl-methodA()");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceCImpl-methodB()");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceCImpl-methodC()");
    }
}
