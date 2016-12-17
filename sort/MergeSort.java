package ademin.algo.sort;

import ademin.algo.MyArr;

import java.util.Arrays;
import java.util.Stack;

/**
 * Сортировка слиянием
 * Created by Anton on 14.12.2016.
 */
public class MergeSort {
    public static long iter = 0;

    public static int[] run(int[] arrParam) {
        long startTime = System.currentTimeMillis();
        System.out.println("MergeSort start...");
        ////////////
        int[] arr = sorting(arrParam.clone());
        ////////////
        long endTime = System.currentTimeMillis();
        System.out.println("MergeSort end... it work " + (endTime - startTime) + " miliseconds; " + iter + " iterations;");
        return arr;
    }

    public static int[] sorting(int[] arr) {
        int len = arr.length;
        if (len <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = sorting(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sorting(Arrays.copyOfRange(arr, mid, len));


        return merge(left, right);

    }

    public static int[] merge(int[] l, int[] r) {
        int[] arr = new int[l.length + r.length];
        ////
        Stack<Integer> left = new Stack<Integer>();
        for (int k = l.length - 1; k >= 0; k--) {
            left.push(l[k]);
        }

        Stack<Integer> right = new Stack<Integer>();
        for (int k = r.length - 1; k >= 0; k--) {
            right.push(r[k]);
        }
        int i = 0;
        while (!left.empty() && !right.empty()) {
            iter++;
            if (left.peek() < right.peek()) {
                arr[i] = left.pop();
            } else {
                arr[i] = right.pop();
            }
            i++;
        }
        while (!right.empty()) {
            iter++;
            arr[i] = right.pop();
            i++;
        }
        while (!left.empty()) {
            iter++;
            arr[i] = left.pop();
            i++;
        }

        return arr;
    }
}
