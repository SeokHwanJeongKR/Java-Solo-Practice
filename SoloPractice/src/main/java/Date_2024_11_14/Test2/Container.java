package Date_2024_11_14.Test2;

public class Container<T> implements Storable {

    private final T t;

    public Container(T t) {
        this.t = t;
    }

    @Override
    public Object get() {
        return null;
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
