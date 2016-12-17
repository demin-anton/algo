package ademin.algo.sort;

import java.util.ArrayList;

/**
 * Сортировка вставками
 * Created by ADemin on 12.12.2016.
 */
public class InsertionSort {
    public static int[] run(int[] arrParam) {
        long startTime = System.currentTimeMillis();
        System.out.println("InsertionSort start...");
        ////////////
        int[] arr = arrParam.clone();
        long iter = 0;
        int tmp;
        int j;
        for (int i = 1; i < arr.length; i++) {
            iter++;
            tmp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > tmp) {
                iter++;
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = tmp;
        }
        ////////////
        long endTime = System.currentTimeMillis();
        System.out.println("InsertionSort end... it work " + (endTime - startTime) + " miliseconds; " + iter + " iterations;");
        return arr;
    }
}
