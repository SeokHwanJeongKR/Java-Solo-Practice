package Date_2024_11_10.generic.Test3;

import Date_2024_11_10.generic.Test.Biounit;
import Date_2024_11_10.generic.Test.Marine;
import Date_2024_11_10.generic.Test2.Shuttle;

public class UnitPrinter {
    public static <T extends Biounit>void printV1(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends Biounit> t1) {
        Biounit unit = t1.out();
        System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());
    }
}
