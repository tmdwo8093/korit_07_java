package ch15_casting.centralcontrol;

public class CentralControlMain {
    public static void main(String[] args) {

        // 각 클래스의 객체 생성
        Computer computer1 = new Computer();
        AirConditioner airConditioner1 = new AirConditioner();
        Speaker speaker1 = new Speaker();
        // 참조자료형의 배열을 생성(비어있는거)
//        Power[] powers = new Power[5];
        // 이하의 코드는 powers 생성하면서 indexNumber가 고정되어서 안쓸겁니다.
//        Power[] powers = {new Computer(), new AirConditioner(), new Speaker()};

        // 저희는 그래서 centerControl 객체를 만들면서 내부의 필드에 비어있는 Power[] 배열을
        // 집어넣었습니다.
        CenterControl centerControl = new CenterControl(
                new Power[5]
        );

        centerControl.addDevice(computer1);     // 여기서 (암시적) 업케스팅이 이루어졌습니다.
        centerControl.addDevice(airConditioner1);
        centerControl.addDevice(speaker1);


        // 에어컨
        airConditioner1.on();
        airConditioner1.off();

        System.out.println();

        // 스피커
        speaker1.on();
        speaker1.off();
    }
}
