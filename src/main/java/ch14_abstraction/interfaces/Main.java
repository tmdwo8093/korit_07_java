package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
//        TvRemoteController tvRemoteController = new TvRemoteController(
//
//        );
//    }

        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를 생성하는 방법
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(),
                new VolumeDownButton(), new VolumeUpButton()
        );

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        System.out.println(tvRemoteController.onUpChannelButton1());
        tvRemoteController.onUpChannelButton2();
        System.out.println();

        tvRemoteController.onPressedDownVolumeButton();
        tvRemoteController.onDownVolumeButton();
        tvRemoteController.onPressedUpVolumeButton();
        System.out.println(tvRemoteController.onUpVolumeButton1());
        tvRemoteController.onUpVolumeButton2();

        // 에어컨 온도 조절

        AirConditionerController airConditionerController = new AirConditionerController(
                new PowerButton(), new TemperatureDownButton(), new TemperatureUpButton(),
                new ModeChangeButton()
        );

        System.out.println();
        AirConditionerController airConditionerController2 = new AirConditionerController();
        airConditionerController.onPressedPowerButton();
        airConditionerController.onPressedDownTemperatureButton();
        airConditionerController.OnDownTemperatureButton();
        airConditionerController.onPressedUpTemperatureButton();
        System.out.println(airConditionerController.onUpTemperatureButton1());
        airConditionerController.setModeChangeButton();
        airConditionerController.setModeChangeButton();
        airConditionerController.onPressedPowerButton();
    }
}
