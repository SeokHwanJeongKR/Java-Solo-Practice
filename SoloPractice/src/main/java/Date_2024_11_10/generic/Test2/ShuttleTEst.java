package Date_2024_11_10.generic.Test2;

import Date_2024_11_10.generic.Test.Marine;
import Date_2024_11_10.generic.Test.Zealot;
import Date_2024_11_10.generic.Test.Zergling;

public class ShuttleTEst {
    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine(50,"마린"));
        shuttle1.showInfo();

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling(100, "저글링"));
        shuttle2.showInfo();

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot(150, "질럿"));
        shuttle2.showInfo();
    }
}
