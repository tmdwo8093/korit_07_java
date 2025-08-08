package ch13_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("나비");
        Animal animal3 = new Animal(1);
        Animal animal4 = new Animal("바둑이", 2);

        System.out.println(animal1.getAnimalName());

        // Tiger 객체 생성
        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("티그리스");
        tiger1.setAnimalAge(3);
        String tigerName = tiger1.getAnimalName();
        int tigerAge = tiger1.getAnimalAge();
        System.out.println("이 호랑이의 이름은 " + tigerName + "이고, ");
        System.out.println(tigerAge + " 살입니다.");

        tiger1.hunt();
        tiger1.hunt("푸바오");
        tiger1.move();  // 재정의된 move() 호출
        animal1.move(); // 부모 method 원본 그대로 호출
        System.out.println();

        Human human1 = new Human();
        human1.setAnimalName("백승재");
        human1.setAnimalAge(22);
        String humanName = human1.getAnimalName();
        int humanAge = human1.getAnimalAge();
        System.out.println("안녕하세요, 제 이름은 " + humanName + "이고 나이는 "
                + humanAge + "살 입니다." );
        System.out.println("내년에는 " + (humanAge+1) + "살이 됩니다.");
        System.out.println();

        Human human2 = new Human();
        human1.move();
        human2.setAnimalName("백승재");
        System.out.println("안녕하세요, 제 이름은 " + humanName + "이고 나이는 "
                + humanAge + "살 입니다." );
        System.out.println("내년에는 " + (humanAge+1) + "살이 됩니다.");
        human2.read("자바의 기초");

    }
}
