public class Solo<T> {

    private T value;

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

    public Solo(T value){
        this.value = value;
    }
}