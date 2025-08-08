package ch14_abstraction.interfaces_p;

public class Cash implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println(amount + "원을 현금으로 결제합니다.");
    }
}
