package ademin.algo;

import java.util.ArrayList;

/**
 * Created by Anton on 10.12.2016.123121232413
 */
public class MyArr {
    public static int[] getArr(int len) {
        return getArr(len, 1000);
    }

    public static int[] getArr(int len, int maxVal) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = ((int) (Math.random() * maxVal));
        }
        return arr;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
