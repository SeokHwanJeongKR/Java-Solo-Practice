package Date_2024_11_24;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //index 입력
        System.out.println("====index 입력 : 0(1) ====");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        arr[2] = 10;
        System.out.println("==배열 검색 0(n)==");

        int value = 10;
        for(int i = 1; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            if (arr[i] == value) {
                System.out.println(value + "찾음");
                break;
            }
        }
    }
}
