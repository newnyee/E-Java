package e_java.ch06.verify.exam15;

public class MemberService {

    boolean login (String id, String password) {
        if("hong".equals(id) && "12345".equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    void logout(String id) {
        System.out.println( id + "님이 로그아웃 되었습니다.");
    }
}
