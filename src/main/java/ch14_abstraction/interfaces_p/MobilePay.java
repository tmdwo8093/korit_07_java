package ch14_abstraction.interfaces_p;

public class MobilePay implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("1500원을 모바일 페이로 결제합니다.");
    }
}
