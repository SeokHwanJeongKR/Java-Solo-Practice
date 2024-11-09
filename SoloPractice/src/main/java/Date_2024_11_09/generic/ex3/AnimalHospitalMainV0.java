package Date_2024_11_09.generic.ex3;

import Date_2024_11_09.generic.animal.Cat;
import Date_2024_11_09.generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        System.out.println();
        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        dogHospital.set(dog);

        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
