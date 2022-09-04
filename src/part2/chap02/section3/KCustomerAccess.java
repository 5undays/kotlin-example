package part2.chap02.section3;

public class KCustomerAccess {
    public static void main(String[] args) {
        // 코틀린 클래스의 컴패니언 객체를 접근
        System.out.println(KCustomer.LEVEL);
        KCustomer.login(); // 어노테이션 접근 방법
        KCustomer.Companion.login(); //위와 동일한 결과로 어노테이션 사용하지 않을때 접근법
    }
}
