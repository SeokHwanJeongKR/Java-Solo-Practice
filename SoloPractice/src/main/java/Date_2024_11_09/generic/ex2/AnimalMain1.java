package Date_2024_11_09.generic.ex2;

import Date_2024_11_09.generic.animal.Animal;
import Date_2024_11_09.generic.animal.Cat;
import Date_2024_11_09.generic.animal.Dog;

public class AnimalMain1 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물 ",0);
        Dog dog = new Dog("멍멍이" , 100);
        Cat cat = new Cat("냐옹이" , 50);


        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);
        System.out.println(findDog.getSize());
    }


}
