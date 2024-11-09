package Date_2024_11_09.generic.ex3;

import Date_2024_11_09.generic.animal.Cat;
import Date_2024_11_09.generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        System.out.println();
        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        System.out.println();
        //문제1. 개병원에 고양이 전달 컴파일 오류 발생 No 정상적으로 실행
        dogHospital.set(cat);


        //문제2. 개 타입 반환 다운캐스팅을 해야함 타입 안정성
        dogHospital.set(dog);
        Dog biggerCog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerCog = " + biggerCog);
    }
}
