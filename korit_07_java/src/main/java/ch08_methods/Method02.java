package ch08_methods;

import java.util.Scanner;

/*
    별찍기 관련한 부분을 저희가 메서드화 시켜보도록 하겠습니다
 */
public class Method02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowOfStars = 0;
        int choice = 0;
        String starResult = "";

        System.out.println("몇 줄 짜리 별을 생성할까요? >>> ");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른족으로 치우친 감소하는 별");
        choice = scanner.nextInt();
    }
}
