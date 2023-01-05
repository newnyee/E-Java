package e_java.ch06.verify.exam18;

public class ShopService {
    private static ShopService service = new ShopService();

    private ShopService() {}

    public static ShopService getInstance() {
        return service;
    }
}
