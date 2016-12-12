package ademin.algo.sort;

import java.util.ArrayList;

/**
 * Сортировка пузырьком
 * Created by Anton on 10.12.2016.
 */
public class BubbleSort {
    public static ArrayList<Integer> run(ArrayList<Integer> arrParam) {
        long startTime = System.currentTimeMillis();
        System.out.println("BubbleSort start...");
        ////////////
        ArrayList<Integer> arr = (ArrayList<Integer>) arrParam.clone();
        int tmp;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    tmp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, tmp);
                }
            }
        }
        ////////////
        long endTime = System.currentTimeMillis();
        System.out.println("BubbleSort end... it work " + (endTime - startTime) + " miliseconds");
        return arr;
    }
}
