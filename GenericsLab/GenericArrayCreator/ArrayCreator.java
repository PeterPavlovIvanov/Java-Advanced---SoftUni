package GenericsLab.GenericArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {

    public static <T> T[] create(int length, T item) {

        T[] array = (T[]) new Object[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }

        return array;
    }


    public static <T> T[] create(Class<T> tclass, int length, T item) {
        T[] array = (T[]) Array.newInstance(tclass, length);

        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }

        return array;
    }

}
