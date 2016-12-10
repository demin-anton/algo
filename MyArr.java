package ademin.algo;

import java.util.ArrayList;

/**
 * Created by Anton on 10.12.2016.
 */
public class MyArr {
    public static ArrayList<Integer> getArr(int len) {
        return getArr(len, 1000);
    }

    public static ArrayList<Integer> getArr(int len, int maxVal) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            arr.add((int) (Math.random() * maxVal));
        }
        return arr;
    }
}
