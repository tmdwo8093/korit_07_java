package ch14_abstraction.interfaces;

public class TvRemoteController {
    // 필드 선언
    private PowerButton powerButton;    // 접근지정자 클래스명 객체명 -> 여태까지의 작성방법과 다름
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton,
                              ChannelDownButton channelDownButton,
                              ChannelUpButton channelUpButton,
                              VolumeDownButton volumeDownButton,
                              VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    // 이제 이상에서 선언한 필드(객체)의 메서드를 호출하는 방법
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }
    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }
    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    public void onDownChannelButton() {
        channelDownButton.onDown();
    }

    // #1
    public String onUpChannelButton1() {
        return channelUpButton.onUp();
    }

    // #2
    public void onUpChannelButton2() {
        System.out.println(channelUpButton.onUp());
    }


    // 음량 조절 파트

    public void onPressedDownVolumeButton() {
        volumeDownButton.onPressed();
    }
    public void onPressedUpVolumeButton() {
        volumeUpButton.onPressed();
    }


    public void onDownVolumeButton() {
        volumeDownButton.onDown();
    }

    // #1
    public String onUpVolumeButton1() {
        return volumeUpButton.onUp();
    }
    // #2
    public void onUpVolumeButton2() {
        System.out.println(volumeUpButton.onUp());
    }

}
