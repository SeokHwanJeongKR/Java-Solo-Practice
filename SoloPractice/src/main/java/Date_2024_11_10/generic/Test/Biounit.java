package Date_2024_11_10.generic.Test;

public class Biounit {

    private String name;
    private int hp;

    public Biounit(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return "Biounit{" +
                "hp=" + hp +
                ", name='" + name + '\'' +
                '}';
    }
}
