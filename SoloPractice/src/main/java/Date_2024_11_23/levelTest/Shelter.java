package Date_2024_11_23.levelTest;

public class Shelter <T extends Animal> {

    private T animal;
    private String add = "!";

    public void support(T t) {
        if(animal != null) {
            System.out.println(this.animal.getName()+"은(는) 물러 났습니다. " + t.getName() + "이(가) 휴식처에서 휴식을 취하고 있습니다.");
            animal = t;

        } else {
            animal = t;
            System.out.println(t.getName() +
                    "이(가) 휴식처에서 휴식을 취하고 있습니다.");
        }
    }


}
