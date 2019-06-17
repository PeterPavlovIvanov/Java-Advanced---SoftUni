package GenericsExercise.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CustomList<T extends Comparable<T>> {
    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<T>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public T remove(int index) {
        T temp = this.elements.get(index);
        this.elements.remove(index);
        return temp;
    }

    public boolean contains(T element) {
        boolean isContaining = false;
        for (T e : this.elements) {
            if (e.equals(element)) {
                isContaining = true;
                break;
            }
        }
        return isContaining;
    }

    public void swap(int i1, int i2) {
        T temp = this.elements.get(i1);
        this.elements.set(i1, this.elements.get(i2));
        this.elements.set(i2, temp);
    }

    public int countGreater(T element) {
        int count = 0;

        for (T e : this.elements) {
            if (e.compareTo(element) > 0) {
                count++;
            }
        }

        return count;
    }

    public T getMax(){
        return Collections.max(this.elements);
    }

    public T getMin(){
        return Collections.min(this.elements);

    }

    public void print(){
        for (T e: this.elements){
            System.out.println(e);
        }
    }

}
