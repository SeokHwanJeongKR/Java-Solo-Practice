package Date_2024_11_23.unit;

import Date_2024_11_10.generic.Test.Biounit;

public class UnitUtil {

    public static <T extends Biounit> T maxHP(T t1, T t2) {
        if (t1.getHp() > t2.getHp()) {
            return t1;
        } else {
            return t2;
        }
    }
}
