package ch15_casting.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.fetch();

        Animal animal = dog;    // 업캐스팅 # 1

        animal.makeSound();     // 결과값 : 개가 짖습니다.. 즉 재정의된 method가 호출됨.
        // animal.fetch();     // 이게 불가능

        Animal animal1 = new Dog();     // 이게 제가 말하는 A a = new B(); 형태입니다. 시험에 자주 나옴

        animal1.makeSound();

        /*
            클래스 A 객체명 = new 클래스B();를 통해 객체를 생성했을 경우
            1. Override가 적용된 메서드, 즉 자식 클래스의 메서드가 호출됨.
            2. 클래스B(자작 클래스)의 고유 메서드는 호출 불가능.

            그럼 어차피 재정의된 method 버전으로 호출이 될거라면 애초에
            클래스B 객체명 = new 클래스B();로 생성해버리면 재정의된 method도 호출되고 고유
            method도 호출 할 수 있으니까 골치 안아픈거 아니냐
         */

        Animal animal2 = new Animal();
        animal2.makeSound();        // 결과값 : 동물이 소리를 냅니다.

        // 연산자 instanceof 사용 사례
        boolean result = animal instanceof Animal;
        System.out.println(result);     // true
        boolean result2 = animal instanceof Animal;
        System.out.println(result2);    // true

        // 업캐스팅이 이루어지지 않고 그냥 Dog dog1 = new Dog();로 만든 객체 역시
        boolean result3 = dog instanceof Animal;
        System.out.println(result3);    // true
        boolean result4 = animal1 instanceof Dog;
        System.out.println(result4);    // true

        // animal2의 경우 Animal animal2 = new Animal();로 생성했었습니다.
        boolean result5 = animal2 instanceof Animal;
        System.out.println(result5);    // true
        boolean result6 = animal2 instanceof Dog;
        System.out.println(result6);    // false

        System.out.println("↑ 업캐스팅 파트 - 객체명,메서드명() 했을 때 재정의 버전이 나오는가 아닌가에 주목");
        System.out.println("↓ 다운캐스팅 파트");
        /*
            다운 캐스팅은 '명시적'으로 이루어져야 합니다.
            방법
            (클래스명)객체명; -> (int)2.3; 과 같은 방식이죠. conversion의 객체 버전이라고 생각하시면 됩니다.
            그래서 기본 자료형의 형변환에서 벗어나서 참조 자료형까지 고려하셔야 합니다.
         */

        Dog dog1 = (Dog) animal1; // 다운 캐스팅 방법 -> 위에 보시면 Animal animal1 = new Dog();로 생성해서 dog2 객체명은 없습니다.
        dog1.makeSound();   // 결과값 :  개가 짖습니다.
        dog1.fetch();
        // dog1로 새로운 객체명을 선언하고 거기에 명시적 참조 자료형 캐스팅을 적용하여 Animal 클래스의
        // 인스터스인 animal1을 downcasting 했습니다.
        // 그 결과 원래도 되던 재정의 버전의 makeSound(); 호출은 변함이 없고,
        // Dog 클래스의 고유 메서드인 fetch();도 호출이 가능합니다.
        // 여전히 B b = new B();로 생성하면 귀찮은 일 없지 않냐는 의문이 존재합니다.

//        Dog dog2 = (Dog) animal2; // downcasting 하는 과정에서 오류가 발생함
//        dog2.makeSound(); // 그러니까 얘는 지금 호출도 못해보는 상황입니다.

        /*
            67번 라인에서 오류가 발생했습니다.
            즉 애초에 animal2를 생성할때 Animal 클래스의 생성자를 호출해서 만들었기 때문에
            (A a = new A();이기 때문에)
            하위 클래스의 인스턴스로 다운캐스팅하는 것이 불가능합니다

            이상을 해결하기 위해서는

         */

        Animal animal3 = new Dog();
        // 형태로 선언된 클래스와 호출되는 생성자가 서로 달라야합니다.( 그리고 둘은 상속관계여야합니다.)

        // 그렇다면 현재 코드라인 상에서 빨간줄 뜨지도 않으니깐 잘못 다운캐스팅이 이루어지는지에 대한
        // 확인이 불가능한 상태인데, 이를 해결하기 위한 것이 instanceof 연산자 압니다.

        System.out.println("animal3 검증 파트");
        if (animal3 instanceof Dog) {       // 이 조건식이 true 라면 animal3의 생성시 호출된 생성자는 Dog();
            Dog dog3 = (Dog) animal3;       // 그러므로 88번 라인의 실행문을 통해 다운캐스팅을 하더라도 오류 발생 x

            dog3.makeSound();
            dog3.fetch();
        }
        System.out.println("animal2는 다운캐스팅 안되는거 알았으니깐 검증 후에 다운캐스팅 시도해야겠네요");
        if (animal2 instanceof Dog) {
            Dog dog4 = (Dog) animal2;

            dog4.makeSound();
            dog4.fetch();
        } else {
            System.out.println("불가능한 다운캐스트 입니다.");
        }
    }
}
