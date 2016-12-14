package ademin.algo.sort;

import java.util.ArrayList;

/**
 * Сортировка слиянием
 * Created by Anton on 14.12.2016.
 */
public class MergeSort {
    public static ArrayList<Integer> run(ArrayList<Integer> arrParam) {
        long startTime = System.currentTimeMillis();
        System.out.println("MergeSort start...");
        ////////////
        ArrayList<Integer> arr = (ArrayList<Integer>) arrParam.clone();
        ////////////
        long endTime = System.currentTimeMillis();
        System.out.println("MergeSort end... it work " + (endTime - startTime) + " miliseconds");
        return arr;
    }
}
