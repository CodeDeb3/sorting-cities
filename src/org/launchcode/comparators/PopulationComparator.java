package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by Debbie on 4/3/2017.
 */
public class PopulationComparator implements Comparator<City> {
    @Override
    // needs to be reversed

    public int compare(City o1, City o2) {
        return ((Integer) o2.getPopulation() CompareTo o1.getPopulation );
    }
}
