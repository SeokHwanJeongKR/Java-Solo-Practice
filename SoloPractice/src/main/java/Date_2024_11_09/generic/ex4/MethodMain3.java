package Date_2024_11_09.generic.ex4;

import Date_2024_11_09.generic.animal.Cat;
import Date_2024_11_09.generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이",100);
        Cat cat  = new Cat("냐옹이",50);
        ComplexBox<Dog> hospital = new ComplexBox<>();

        hospital.set(dog);


        Cat returnCat = hospital.printAndReturn(cat);

        System.out.println(returnCat);
    }
}
