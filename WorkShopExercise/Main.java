package WorkShopExercise;

public class Main {
    public static void main(String[] args) {

        CustomLinkedList customLinkedList = new CustomLinkedList();

        System.out.println();
        customLinkedList.addLast(12);
        customLinkedList.addLast(923);
        customLinkedList.addLast(754);
        customLinkedList.addLast(832);
        customLinkedList.addFirst(2);
        customLinkedList.addFirst(2);
        customLinkedList.addFirst(2);
        System.out.println(customLinkedList.removeFirst());
        System.out.println(customLinkedList.removeLast());

        int[] arr = customLinkedList.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        customLinkedList.forEach(System.out::println);
        System.out.println();

    }
}
