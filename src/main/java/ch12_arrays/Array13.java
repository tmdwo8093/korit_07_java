package ch12_arrays;

import java.util.Arrays;

/*
    다차원 배열(
 */
public class Array13 {
    public static void main(String[] args) {
        int[][] arr03 = {{1, 2,}, {3, 4,}, {5, 6,}};
        // 5라는 숫자를 뽑아내고 싶다
        System.out.println(arr03[2][0]);
        System.out.println(arr03[2]);       // 결과값 : [I@36baf30c
        System.out.println(arr03);          // 결과값 : [[I@7a81197d
        System.out.println(Arrays.toString(arr03)); // 결과값 : [[I@5ca881b5, [I@24d46ca6, [I@36baf30c]

        // 2차 배열의 element 추출 -> 중첩 for문을 사용해야함
        for ( int i = 0 ; i < arr03.length ; i++ ) {
            for ( int j = 0 ; j < arr03[i].length ; j++ ) {
                System.out.print(arr03[i][j] + " ");
            }
            System.out.println();
        }

        for ( int[] firstArray : arr03 ) {
            for ( int secondArray : firstArray ) {
                System.out.print(secondArray + " ");
            }
            System.out.println();
        }
    }
}