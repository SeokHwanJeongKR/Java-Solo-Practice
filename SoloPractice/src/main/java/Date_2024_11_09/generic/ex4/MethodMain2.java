package Date_2024_11_09.generic.ex4;

import Date_2024_11_09.generic.animal.Cat;
import Date_2024_11_09.generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이",100);
        Cat cat  = new Cat("냐옹이",100);

        AnimalMethod.checkup(dog);
        System.out.println();

        AnimalMethod.checkup(cat);

        System.out.println();
        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.bigger(dog,targetDog);
        System.out.println("bigger = " + bigger);
    }
}
