package ch13_inheritance;
/*
    super 키워드
        1. super();     -> 얘는 부모 생성자를 호출한다는 의미
        2. super.메서드명();    -> 얘는 부모클래스의 메서드를 호출한다는 의미


 */
public class Product extends Item {
    private int price;
    private int stock;

    // 이거는 부모 생성자를 호출한건데, Product 클래스의 AllArgsConstructor를 만들고 싶다면
    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;
    }

    // 자식 고유의 field에 대한 getter /setter 정의
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void showInfo() {
        System.out.println("제품명 : " + this.getName());  // 부모거라서 getter로 조회
        System.out.println("카테고리 : " + this.getCategory());
        System.out.println("가격 : " + price);            // 자식 거라서 field로 조회
        System.out.println("재고 : " + stock);
    }
}
