package Date_2024_11_10.generic.Test;

import java.awt.color.ICC_ColorSpace;

public class UnitUtill {

    public static <T extends Biounit> T maxHP(T t1, T t2) {
        if (t1.getHp() > t2.getHp()) {
            return t1;
        } else {
            return t2;
        }
    }
}
