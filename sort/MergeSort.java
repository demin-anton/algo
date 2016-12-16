package ademin.algo.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Сортировка слиянием
 * Created by Anton on 14.12.2016.
 */
public class MergeSort {
    public static int[] run(int[] arrParam) {
        long startTime = System.currentTimeMillis();
        System.out.println("MergeSort start...");
        ////////////
        int iter = 0;
        int[] arr = arrParam.clone();
        ////////////
        long endTime = System.currentTimeMillis();
        System.out.println("MergeSort end... it work " + (endTime - startTime) + " miliseconds; " + iter + " iterations;");
        return arr;
    }
}
