package Date_2024_11_09.generic.ex4;

import Date_2024_11_09.generic.animal.Animal;

public class AnimalMethod {

    public static <T extends Animal> void checkup(T t) {

        System.out.println("동물 이름 : " + t.getName());
        System.out.println("동물 크기 : " + t.getSize());
        t.sound();
    }

    public static <T extends Animal> T bigger(T ti, T t2) {
        return ti.getSize() > t2.getSize() ? ti : t2;

    }
}
