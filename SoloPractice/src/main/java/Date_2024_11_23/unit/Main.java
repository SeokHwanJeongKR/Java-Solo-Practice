package Date_2024_11_23.unit;

public class Main {

    public static void main(String[] args) {

        Marine m1 = new Marine(50, "마린1");
        Marine m2 = new Marine(100, "마린2");
        Marine result = UnitUtil.maxHP(m1, m2);
        System.out.println(result);

        Shuttle<Marine> ms = new Shuttle<>();
        ms.in(m1);
        ms.showInfo();

    }
}
