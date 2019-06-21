package IteratorsAndComparatorsExercise.StackIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyStack implements Iterable<Integer>{
    private List<Integer> data;

    public MyStack() {
        this.data = new ArrayList<>();
    }

    public void pusher(int element) {
        this.data.add(element);
    }

    public void forEach(){
        for (int i = this.data.size()-1; i >=0 ; i--) {
            System.out.println(this.data.get(i));
        }
    }

    public int poper() throws IllegalAccessException {
        if (this.data.size() > 0) {
            int toReturn = this.data.get(this.data.size()-1);
            this.data.remove(this.data.size() - 1);
            return toReturn;
        } else {
            throw new IllegalAccessException("No elements");
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

//    @Override
//    public Iterator<Integer> iterator(){
//        return new Iterator<Integer>() {
//            private int index = 0;
//
//            @Override
//            public boolean hasNext() {
//                return this.index < data.size() - 1;
//            }
//
//            @Override
//            public int next() {
//                int element = data.get(this.index);
//                this.index++;
//                return element;
//            }
//        };
//    }
}
