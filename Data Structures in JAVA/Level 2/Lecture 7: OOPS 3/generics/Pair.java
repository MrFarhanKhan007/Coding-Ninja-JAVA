package generics;

public class pair <T, S>{
    private  T first;
    private T second;

    public pair(T first,S second){
        this.first= first;
        this.second= (T) second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
