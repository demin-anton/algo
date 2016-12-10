package ademin.algo;

import java.util.ArrayList;

/**
 * Created by Anton on 10.12.2016.
 */
public class MyArr {
    public static ArrayList<Integer> getArr(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            arr.add((int) (Math.random() * 1000));
        }
        System.out.println(arr);
        return arr;
    }
}
