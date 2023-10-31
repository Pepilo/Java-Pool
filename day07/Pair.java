public class Pair<T, V>{

    private T first;
    private V second;

    public T getFirst(){
        return first;
    }
    public V getSecond(){
        return second;
    }

    public Pair(T first, V second){
        this.first = first;
        this.second = second;
    }

    public void display(){
        System.out.println("first: " + getFirst() + ", second: " + getSecond() + ".");
    }
}