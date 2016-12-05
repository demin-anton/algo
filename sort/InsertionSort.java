package ademin.algo.sort;

import java.util.ArrayList;

/**
 * Сортировка вставками
 * Created by ADemin on 12.12.2016.
 */
public class InsertionSort {
    public static ArrayList<Integer> run(ArrayList<Integer> arrParam) {
        long startTime = System.currentTimeMillis();
        System.out.println("InsertionSort start...");
        ////////////
        ArrayList<Integer> arr = (ArrayList<Integer>) arrParam.clone();
        int tmp;
        int j;
        for (int i = 1; i < arr.size(); i++) {
            tmp = arr.get(i);
            j = i;
            while (j > 0 && arr.get(j - 1) > tmp) {
                arr.set(j, arr.get(j - 1));
                j = j - 1;
            }
            arr.set(j, tmp);
        }
        ////////////
        long endTime = System.currentTimeMillis();
        System.out.println("InsertionSort end... it work " + (endTime - startTime) + " miliseconds");
        return arr;
    }
}
