package ch14_abstraction.interfaces_p2;

public class BankTransfer implements Payment{
    @Override
    public boolean pay(int amount) {
        System.out.println(amount + "원이 계좌 이체 되었습니다.");
        return true;
    }
}
