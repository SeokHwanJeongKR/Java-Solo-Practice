package Date_2024_11_10.generic.Test;

public class UntiUtillTest {

    public static void main(String[] args) {

        Marine m1 = new Marine(40,"마린1");
        Marine m2 = new Marine(50,"마린2");
        Marine resultMarin = UnitUtill.maxHP(m1,m2);
        System.out.println("resultMarin = " + resultMarin);

        Zealot z1 = new Zealot(100, "질럿1");
        Zealot z2 = new Zealot(150, "질럿2");
        Zealot resultZealot = UnitUtill.maxHP(z1,z2);
        System.out.println("resultZealot = " + resultZealot);

    }
}
