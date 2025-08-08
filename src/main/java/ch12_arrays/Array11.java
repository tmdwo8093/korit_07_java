package ch12_arrays;

public class Array11 {
    public static void main(String[] args) {
        /*
            실행 예
            1번 : 김일
            2번 : 김이
            3번 : 김삼

            ...
            5번 : 김오
            라고 출력될 수 있도록
            일반for문
            향상된 forans
         */
        String[] names = {"김일" , "김이" ,"김삼", "김사", "김오"};
        for (int i = 0 ; i < names.length ; i++ ) {
            System.out.println((i+1) + "번 : " + names[i]);
        }
        System.out.println();
        int count = 0;
        for ( String name : names ) {
            System.out.println(++count + "번 : " + name );
        }

    }
}
