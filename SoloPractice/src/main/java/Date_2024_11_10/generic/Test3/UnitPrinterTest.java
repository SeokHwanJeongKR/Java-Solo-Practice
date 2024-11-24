package Date_2024_11_10.generic.Test3;

import Date_2024_11_10.generic.Test.Marine;
import Date_2024_11_10.generic.Test.Zealot;
import Date_2024_11_10.generic.Test.Zergling;
import Date_2024_11_10.generic.Test2.Shuttle;

public class UnitPrinterTest {
    public static void main(String[] args) {

        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine(40, "마린"));

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling(100, "저글링"));

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot(150, "질럿"));

        UnitPrinter.printV1(shuttle1);
        UnitPrinter.printV2(shuttle1);
    }
}
