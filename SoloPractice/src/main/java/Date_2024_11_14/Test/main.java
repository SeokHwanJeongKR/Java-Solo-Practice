package Date_2024_11_14.Test;

public class main {
    public static void main(String[] args) {
        Animal aligator = new Aligator();
        Animal human = new Human();

        aligator.rest(); // 악어가 누워서 휴식을 취합니다.
        human.rest(); // 사람이 누워서 휴식을 취합니다.

        Shelter shelter = new Shelter();

        shelter.support(aligator); // 악어 이(가) 휴식처에서 휴식을 취하고 있습니다.
        shelter.support(human); // 사람이 (가) 휴식처에서 휴식을 취하고 있습니다.
    }
}
