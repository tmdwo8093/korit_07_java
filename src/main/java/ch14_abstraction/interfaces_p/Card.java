package ch14_abstraction.interfaces_p;

public class Card implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println(amount + "원을 카드로 결제합니다.");
    }
}
