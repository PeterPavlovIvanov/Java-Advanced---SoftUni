package GenericsExercise.GenericCountMethodDoubles;

public class Box<T extends Comparable<T>> {
    private T number;

    public T getNumber() {
        return number;
    }

    public Box(T number) {
        this.number = number;
    }
}
