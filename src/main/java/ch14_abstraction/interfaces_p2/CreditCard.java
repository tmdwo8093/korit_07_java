package ch14_abstraction.interfaces_p2;

public class CreditCard implements Payment, PointAccumulatable{

    @Override
    public boolean pay(int amount) {
        if (amount > cardLimit) {
            System.out.println("한도가 초과되었습니다.");
            return false;

        } else {
            cardLimit -= amount;
            System.out.println(amount + "원이 결제되었습니다.");
            accumulatePoints(amount);
            return true;
        }
    }
    @Override
    public void accumulatePoints(int amount) {
        points += amount * 0.01;
    }

    int cardLimit;
    int points;

    public CreditCard(int cardLimit) {
        this.cardLimit = cardLimit;
        this.points = 0;
    }

    void showCardInfo() {
        System.out.println("현재 카드 한도 : " + cardLimit);
        System.out.println("포인트 : " + points);
        System.out.println("--------------------");
    }
}
