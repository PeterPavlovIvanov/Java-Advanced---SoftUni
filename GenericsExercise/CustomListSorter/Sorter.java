package GenericsExercise.CustomListSorter;

public class Sorter{
    public static <T extends Comparable<T>> void sort(CustomList<T> elements){

        for (int i = 0; i < elements.getSize()-1; i++) {
            for (int j = i+1; j < elements.getSize(); j++) {
                if(elements.get(i).compareTo(elements.get(j))>0){
                    elements.swap(i,j);
                }
            }
        }


    }
}
