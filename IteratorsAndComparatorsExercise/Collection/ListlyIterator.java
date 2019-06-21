package IteratorsAndComparatorsExercise.Collection;

import java.util.Iterator;
import java.util.List;

public class ListlyIterator implements Iterable<String> {
    private List<String> data;
    private int index;

    public ListlyIterator(List<String> data) {
        this.data = data;
        this.index = 0;
    }

    public boolean move() {
        if (this.hasNext()) {
            this.index++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        return this.index < this.data.size() - 1;
    }

    public String print() throws IllegalAccessException {
        if (this.data.size() == 0) {
            throw new IllegalAccessException("Invalid Operation!");
        }
        return this.data.get(this.index);
    }

    public void printAll(){
        this.data.stream()
                .forEach( e -> System.out.print(e + " "));
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return this.index < data.size() - 1;
            }

            @Override
            public String next() {
                String element = data.get(this.index);
                this.index++;
                return element;
            }
        };
    }
}
