package ch13_inheritance;

public class productMain {
    public static void main(String[] args) {
        Item item1 = new Item("일반 상품", "일반 카테고리");
        System.out.println("이 상품은 " + item1.getName() + "입니다");
        System.out.println("이 상품은 " + item1.getCategory() + "입니다");
        Product product1 = new Product("전자 제품", "가전 제품",
                100000, 10);
        product1.setCategory("백색 가전 제품");
        System.out.println("해당 제품은 " + product1.getCategory()+ "입니다.");
    }
}
