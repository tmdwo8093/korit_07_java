package ch14_abstraction.interfaces;
/*
    PowerButton 포함 시킬 것
    TemperatureDownButton,
    TemperatureUpButton,
    ModeChangeButton -> 버튼 한번 누를 떄 마다 모드 변환
        냉방 -> 난방
        : Press 버튼을 활용하여 한 번 누르면 그 다음 모드로 이동해야 함

    AllArgsConstructor를 정의하고

    실행 예
    에어컨 리모컨 객체가 생성 되었습니다.
    전원을 켭니다.
    온도를 한칸 내립니다.
    온도를 계속 내립니다.
    온도를 한 칸 올립니다.
    온도를 계속 올립니다.
    난방으로 바뀝니다.
    냉방으로 바뀝니다.
    전원을 끕니다.
 */
public class AirConditionerController {
    // field 선언
    private PowerButton powerButton;    // 접근지정자 클래스명 객체명
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;
    private ModeChangeButton modeChangeButton;

    // 생성자 정의
    public AirConditionerController(PowerButton powerButton,
                                    TemperatureDownButton temperatureDownButton,
                                    TemperatureUpButton temperatureUpButton,
                                     ModeChangeButton modeChangeButton) {
        this.powerButton = powerButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
        this.modeChangeButton = modeChangeButton;
    }

    // method 정의 영역

    public AirConditionerController() {
        System.out.println("에어컨 리모컨 객체가 생성되었습니다.");
    }

    public void onPressedDownTemperatureButton() {
        temperatureDownButton.onPressed();
    }
    public void onPressedUpTemperatureButton() {
        temperatureUpButton.onPressed();
    }
    public void setModeChangeButton() {
        modeChangeButton.onPressed();
    }
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }
    public void OnDownTemperatureButton() {
        temperatureDownButton.onDown();
    }
    public String onUpTemperatureButton1() {
        return temperatureUpButton.onUp();
    }

    }

