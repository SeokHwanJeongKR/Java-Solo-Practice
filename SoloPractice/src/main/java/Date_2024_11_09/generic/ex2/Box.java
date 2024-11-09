package Date_2024_11_09.generic.ex2;

public class Box<T>{
    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}
