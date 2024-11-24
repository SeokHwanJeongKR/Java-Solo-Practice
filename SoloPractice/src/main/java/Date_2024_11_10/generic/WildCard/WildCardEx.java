package Date_2024_11_10.generic.WildCard;

import Date_2024_11_09.generic.animal.Animal;

public class WildCardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    //?는 아무거나 들어 올 수 있다는 것인데 dog, cat,
    static void printWildcardV1(Box<?> box) {
        System.out.println("?와일드 카드 이름 = " + box.get());
    }





    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("?와일드 카드 이름 = " + animal.getName());
    }







    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }
    static Animal printAndReturnWildcardV3(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("?와일드 카드 이름 = " + animal.getName());
        return animal;
    }

}
