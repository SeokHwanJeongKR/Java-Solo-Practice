package Date_2024_11_23.levelTest;

public class Human extends Animal{

    private String name = "사람";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rest() {
        System.out.println("사람이 누워서 휴식을 취합니다.");
    }
}
