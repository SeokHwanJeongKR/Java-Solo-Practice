package Date_2024_11_17;

public class starprint {

    public static void main(String[] args) {

        starTest1(4, 5);

    }

    public static void starTest1 ( int a, int b){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
