요구사항
Vehicle 이라는 이름의 인터페이스를 정의합니다.

void start()

void stop()

Bike 클래스와 Motorcycle 클래스를 정의합니다.

두 클래스 모두 Vehicle 인터페이스를 **구현(implements)**해야 합니다.

Bike 클래스

start(): "자전거 운행을 시작합니다." 출력

stop(): "자전거 운행을 중지합니다." 출력

void useBell(): "자전거 경적을 사용합니다." 출력 (고유 기능)

Motorcycle 클래스

start(): "오토바이 시동을 켭니다." 출력

stop(): "오토바이 시동을 끕니다." 출력

void useBooster(): "가속 기능을 사용합니다." 출력 (고유 기능)

DeliverySystem 이라는 메인 클래스를 정의합니다.

main 메서드 내에 Vehicle 타입의 배열을 생성합니다.

해당 배열에 Bike와 Motorcycle 인스턴스를 각각 추가합니다. (업캐스팅 활용)

반복문을 통해 배열의 모든 Vehicle 인스턴스를 순회하며 다음 로직을 실행합니다.

start() 메서드를 호출합니다.

instanceof 연산자로 타입을 확인하여 Motorcycle일 경우, 다운캐스팅 후 useBooster() 메서드를 호출합니다.

instanceof 연산자로 타입을 확인하여 Bike일 경우, 다운캐스팅 후 useBell() 메서드를 호출합니다.

stop() 메서드를 호출합니다.

구분선("----------")을 출력합니다.