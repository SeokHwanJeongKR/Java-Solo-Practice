package Date_2024_11_10.generic.WildCard;

import Date_2024_11_09.generic.animal.Animal;
import Date_2024_11_09.generic.animal.Cat;
import Date_2024_11_09.generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();


        // Animal 포함 상위 타입 전달기능
        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox);  // 하위 타입 불가
//        writeBox(catBox);  // 하위 타입 불가

    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
