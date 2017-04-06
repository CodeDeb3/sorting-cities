package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;

/**
 * Created by Debbie on 4/3/2017.
 */
public class AreaComparator implements Comparator<City> {

//    @Override
//    public int comparingDouble(City o1, City o2) {
//            return o1.getState().compareTo(o2.getState());

    @Override
    public Comparator<City o1> thenComparingDouble(ToDoubleFunction<? super City> keyExtractor) {
        return o1.getState().compareTo(o2.getState());
    }
}

