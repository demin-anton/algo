package ademin.algo.sort;

import java.util.ArrayList;

/**
 * Сортировка выбором
 * Created by ADemin on 12.12.2016.
 */
public class SelectionSort {
    public static int[] run(int[] arrParam) {
        long startTime = System.currentTimeMillis();
        System.out.println("SelectionSort start...");
        ////////////
        long iter = 0;
        int[] arr = arrParam.clone();
        int min = Integer.MAX_VALUE;
        int index = 0;
        int tmp = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            iter++;
            for (int i = j; i < arr.length; i++) {
                iter++;
                if (arr[i] < min) {
                    min = arr[i];
                    index = i;
                }
            }
            tmp = arr[j];
            arr[j] = min;
            arr[index] = tmp;
            min = Integer.MAX_VALUE;
        }
        ////////////
        long endTime = System.currentTimeMillis();
        System.out.println("SelectionSort end... it work " + (endTime - startTime) + " miliseconds; " + iter + " iterations;");
        return arr;
    }
}
