package ademin.algo.sort;

import java.util.ArrayList;

/**
 * Сортировка пузырьком
 * Created by Anton on 10.12.2016.
 */
public class BubbleSort {
    public static int[] run(int[] arrParam) {
        long startTime = System.currentTimeMillis();
        System.out.println("BubbleSort start...");
        ////////////
        long iter = 0;
        int[] arr = arrParam.clone();
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            iter++;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                iter++;
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        ////////////
        long endTime = System.currentTimeMillis();
        System.out.println("BubbleSort end... it work " + (endTime - startTime) + " miliseconds; " + iter + " iterations;");
        return arr;
    }
}
