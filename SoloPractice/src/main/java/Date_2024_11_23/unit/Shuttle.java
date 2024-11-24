package Date_2024_11_23.unit;

import Date_2024_11_10.generic.Test.Biounit;

public class Shuttle <T extends Biounit> {
    private T unit;

    public void in (T t) {
        unit = t;
    }

    public T out (T t) {
        return unit;
    }

    public void showInfo() {
        System.out.println("이건 show info 이름 :" + unit.getName() + " HP :" + unit.getHp());
    }
}
