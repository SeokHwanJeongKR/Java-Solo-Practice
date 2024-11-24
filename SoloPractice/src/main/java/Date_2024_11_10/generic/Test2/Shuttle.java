package Date_2024_11_10.generic.Test2;

import Date_2024_11_10.generic.Test.Biounit;

public class Shuttle<T extends Biounit>  {

    private T unit;

    public void in(T t) {
        unit = t;
    }

    public T out() {
        return unit;
    }

    public void showInfo() {
        System.out.println("이름 : " + unit.getName()
        + ", Hp : " + unit.getHp());
    }

}
