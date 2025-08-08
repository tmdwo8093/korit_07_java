package ch15_casting.delivery;

public class Motorcycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("오토바이 시동을 켭니다.");
    }

    @Override
    public void stop() {
        System.out.println("오토바이 시동을 끕니다.");
    }

    void useBooster() {
        System.out.println("가속 기능을 사용합니다.");
    }
}
