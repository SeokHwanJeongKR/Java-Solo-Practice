package Date_2024_11_09.generic.ex4;

import Date_2024_11_09.generic.animal.Animal;

public class ComplexBox<T extends Animal>  {

    private T animal;

    public void set (T animal) {
        this.animal = animal;
    }

    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.classname : " + animal.getClass().getName());
        System.out.println("t.classname : " + z.getClass().getName());
        return z;
    }
}
