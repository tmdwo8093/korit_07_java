package ch19_generic.wildcard;

public class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    // 고유 메서드
    public void hunt() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

