package GenericsExercise.GenericSwapMethodInteger;

public class Box<E> {
    private E number;

    public Box(E number) {
        this.number = number;
    }

    @Override
    public String toString(){
        return this.number.getClass().getName() +
                ": " + this.number;
    }
}
