package WorkShop;

import java.util.function.Consumer;

public class SmartArray {
    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }

    public void add(int element) {
        if (this.size == this.capacity) {
            this.resize();
        }
        this.data[this.size++] = element;

    }

    public int get(int index) {
        checkIndex(index);
        int e = this.data[index];
        return e;
    }

    public int remove(int index) {
        checkIndex(index);
        int removedElement = this.data[index];
        shiftLeft(index);

        this.size--;
        if (this.size <= this.capacity / 4) {
            shrink();
        }
        return removedElement;
    }

    public void add(int index, int element) {
        checkIndex(index);
        this.size++;
        if (this.size >= this.capacity) {
            resize();
        }

        shiftRight(index);
        this.data[index] = element;
    }

    public boolean contains(int element){
        boolean isContainingE = false;
        for (int i = 0; i < this.size; i++) {
            if(this.data[i] == element){
                isContainingE = true;
                break;
            }
        }
        return isContainingE;
    }

    public void forEach(Consumer<Integer> consumer){
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }




    private void resize() {
        this.capacity *= 2;
        int[] temp = new int[this.capacity];
        for (int i = 0; i < this.size; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            String message = String.format(
                    "Index %d out of bounds for length %d",
                    index, this.size);
            throw new IndexOutOfBoundsException(message);
        }
    }

    private void shiftLeft(int index) {
        int i = 0;
        for (i = index; i < size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[i] = 0;
    }

    private void shiftRight(int index) {
        for (int i = this.size - 1; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }
    }

    private void shrink() {
        this.capacity /= 2;
        int[] temp = new int[this.capacity];
        for (int i = 0; i < this.size; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

}
