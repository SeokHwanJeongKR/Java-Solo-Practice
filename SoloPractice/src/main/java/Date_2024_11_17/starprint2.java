package Date_2024_11_17;

import java.util.Scanner;

public class starprint2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        starTest2(n);

        if (1 <= n || n <= 100) {

        }


    }
    public static void starTest2 (int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }




}
