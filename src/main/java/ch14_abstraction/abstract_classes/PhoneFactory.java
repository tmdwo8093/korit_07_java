package ch14_abstraction.abstract_classes;

public class PhoneFactory extends Factory{
    @Override
    public void produce(String modal) {
        System.out.println("[ " + modal + " ] 모델 스마트폰을 생산합니다.");

    }

    @Override
    public void manage() {
        System.out.println("스마트폰 공장을 관리합니다. ");

    }

}
