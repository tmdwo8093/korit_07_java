package ch14_abstraction.interfaces_p;
/*
요구사항
Payment 라는 이름의 인터페이스를 만드세요.

이 인터페이스는 void pay(int amount) 라는 메서드를 가져야 합니다. 이 메서드는 결제 금액을 매개변수로 받습니다.

Cash 클래스와 Card 클래스를 만드세요.

이 두 클래스는 모두 Payment 인터페이스를 **구현(implements)**해야 합니다.

Cash 클래스의 pay 메서드는 "[금액]원을 현금으로 결제합니다." 라는 문구를 출력해야 합니다.

Card 클래스의 pay 메서드는 "[금액]원을 카드로 결제합니다." 라는 문구를 출력해야 합니다.

ConvenienceStore 라는 메인 클래스를 만드세요.

main 메서드 안에서 Cash 객체와 Card 객체를 각각 생성하세요.

두 객체의 pay 메서드를 호출해서 각각 1500원을 결제하는 코드를 작성하고, 결과가 올바르게 출력되는지 확인하세요.
 */
public class ConvenienceStore_Main {
    public static void main(String[] args) {
        // Payment라는 '규격'으로 Cash와 Card 객체를 다룰 수 있습니다.
        Payment payment1 = new Cash();
        Payment payment2 = new Card();
        Payment payment3 = new MobilePay();

        payment1.pay(1500); // "1500원을 현금으로 결제합니다." 출력
        payment2.pay(1500); // "1500원을 카드로 결제합니다." 출력
        payment3.pay(1500); // "1500원을 모바일 페이로 결제합니다." 출력
    }
}
