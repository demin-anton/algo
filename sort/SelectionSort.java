package ademin.algo.sort;

import java.util.ArrayList;

/**
 * Сортировка выбором
 * Created by ADemin on 12.12.2016.
 */
public class SelectionSort {
    public static ArrayList<Integer> run(ArrayList<Integer> arrParam) {
        long startTime = System.currentTimeMillis();
        System.out.println("SelectionSort start...");
        ////////////
        ArrayList<Integer> arr = (ArrayList<Integer>) arrParam.clone();
        int min = Integer.MAX_VALUE;
        int index = 0;
        int tmp = 0;
        for (int j = 0; j < arr.size() - 1; j++) {
            for (int i = j; i < arr.size(); i++) {
                if (arr.get(i) < min) {
                    min = arr.get(i);
                    index = i;
                }
            }
            tmp = arr.get(j);
            arr.set(j, min);
            arr.set(index, tmp);
            min = Integer.MAX_VALUE;
        }
        ////////////
        long endTime = System.currentTimeMillis();
        System.out.println("SelectionSort end... it work " + (endTime - startTime) + " miliseconds");
        return arr;
    }
}
