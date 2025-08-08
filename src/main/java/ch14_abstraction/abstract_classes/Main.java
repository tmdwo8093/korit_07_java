package ch14_abstraction.abstract_classes;

public class Main {
    public static void main(String[] args) {
        TabletFactory tabletFactory1 = new TabletFactory();
        tabletFactory1.setName("애플 테블릿 공장");
        tabletFactory1.setName("구글 테블릿 공장");
        System.out.println("현재 공장은 " + tabletFactory1.getName() +"으로 변경되었습니다");
        tabletFactory1.produce("구글 태블릿");
        tabletFactory1.manage();
        tabletFactory1.upgrade("구글 테블릿 10인치 2세대");

        Factory factory2 = new Factory() {
            @Override
            public void produce(String modal) {
                System.out.println(modal + "컴퓨터를 생산 합니다.");
            }

            @Override
            public void manage() {
                System.out.println("컴퓨터 공장을 관리합니다.");
            }

        };
        System.out.println();
        factory2.setName("삼성 컴퓨터 공장");
        factory2.showInfo();

    }
}
