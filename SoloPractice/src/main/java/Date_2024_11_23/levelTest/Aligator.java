package Date_2024_11_23.levelTest;

public class Aligator extends Animal {

    private String name = "악어";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rest() {
        System.out.println("악어가 누워서 휴식을 취합니다.");

    }
}
