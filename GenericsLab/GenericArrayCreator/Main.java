package GenericsLab.GenericArrayCreator;

public class Main {
    public static void main(String[] args) {

 //       Integer[] nums = GenericsLab.GenericArrayCreator.ArrayCreator.<Integer>create
 //               (Integer.class,10, 0);
        Integer[] nums2 = ArrayCreator.<Integer>create
                (10, 0);
        System.out.println();
    }
}
