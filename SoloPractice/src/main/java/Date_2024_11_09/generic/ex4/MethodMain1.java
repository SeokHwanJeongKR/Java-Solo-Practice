package Date_2024_11_09.generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        String a = "오홋?";
        GenericMethod.<Integer>objMethod(i);
        GenericMethod.genericMethod(i);
        GenericMethod.numberMethod(i);
    }
}
