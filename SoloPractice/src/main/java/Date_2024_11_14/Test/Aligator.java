package Date_2024_11_14.Test;

public class Aligator extends Animal{

    private String name;

    public Aligator() {
    }

    @Override
    public void rest() {
        System.out.println("악어가 누워서 휴식을 취합니다.");
    }

    @Override
    String getName() {
        return "악어";
    }
}
