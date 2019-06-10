package WorkShop;
//⦁	int pop() – Removes the last added element

import java.io.IOException;
import java.util.function.Consumer;

public class CustomStack {
    private int[] items;
    private int size;
    private static final int INITIAL_CAPACITY = 4;
    private int capacity;

    public CustomStack() {
        this.capacity = INITIAL_CAPACITY;
        this.items = new int[this.capacity];
    }

    public int getSize() {
        return this.size;
    }

    public void push(int element) {
        if (this.size == this.capacity) {
            this.resize();
        }

        this.items[this.size++] = element;
    }

    public void peek() throws IOException {
        if (this.size == 0) {
            throw new IOException("Cannot peek in an empty collection!");
        }
        System.out.println(this.items[size - 1]);
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.items[i]);
        }
    }

    public int pop() throws IOException {
        if (this.size == 0) {
            throw new IOException("Cannot pop in an empty collection!");
        }
        int cout = this.items[this.size - 1];

        this.items[this.size - 1] = 0;
        this.size--;

        return cout;
    }


    private void resize() {
        this.capacity *= 2;
        int[] temp = new int[this.capacity];

        for (int i = 0; i < this.items.length; i++) {
            temp[i] = this.items[i];
        }

        this.items = temp;
    }

}
