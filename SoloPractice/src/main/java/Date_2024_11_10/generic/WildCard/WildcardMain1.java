package Date_2024_11_10.generic.WildCard;

import Date_2024_11_09.generic.animal.Animal;
import Date_2024_11_09.generic.animal.Cat;
import Date_2024_11_09.generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이",100));

        System.out.println();
        WildCardEx.printGenericV1(dogBox);
        System.out.println("↑v1");
        System.out.println();

        WildCardEx.printGenericV2(dogBox);
        System.out.println("↑v2");
        System.out.println();

        Dog dog = WildCardEx.printAndReturnGeneric(dogBox);
        System.out.println("↑v3");

        System.out.println();
        WildCardEx.printWildcardV1(dogBox);
        System.out.println("↑v4 wildcard");

        System.out.println();
        WildCardEx.printWildcardV2(dogBox);
        System.out.println("↑v4 wildcardV2");

        System.out.println("--------");
        Dog dog2 = WildCardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildCardEx.printAndReturnWildcardV3(dogBox);
    }
}
