package ch15_casting.delivery;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("자전거 운행을 시작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("자전거 운행을 중지합니다.");
    }

    void useBell() {
        System.out.println("자전거 경적을 사용합니다.");
    }
}
