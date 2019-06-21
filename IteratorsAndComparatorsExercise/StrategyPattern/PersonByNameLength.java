package IteratorsAndComparatorsExercise.StrategyPattern;

import java.util.Comparator;

public class PersonByNameLength implements Comparator<Person> {
    @Override
    public int compare(Person f, Person s) {

        int compareRes = f.getName().length() - s.getName().length();

        if (compareRes == 0) {
            int a = f.getName().toLowerCase().charAt(0);
            int b = s.getName().toLowerCase().charAt(0);
            return Integer.compare(a,b);
        }
        return compareRes;
    }
}
