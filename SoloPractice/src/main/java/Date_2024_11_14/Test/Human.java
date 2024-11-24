package Date_2024_11_14.Test;

public class Human extends Animal{
    private String name;


    public Human() {
    }

    @Override
    public void rest() {
        System.out.println("사람이 누워서 휴식을 취합니다");
    }

    @Override
    String getName() {
        return "사람";
    }
}
