package ademin.algo;

import ademin.algo.sort.BubbleSort;
import ademin.algo.sort.InsertionSort;
import ademin.algo.sort.SelectionSort;

import java.util.ArrayList;

/**
 * Created by ADemin on 12.12.2016.
 */
public class TestAlgs {
    public static void main(String[] args) {
        //
        System.out.println("Array:");
        ArrayList<Integer> arr = MyArr.getArr(20);
        System.out.println(arr);
        // InsertionSort
        System.out.println("");
        ArrayList<Integer> arrInsertion = InsertionSort.run(arr);
        System.out.println(arrInsertion);
        // SelectionSort
        System.out.println("");
        ArrayList<Integer> arrSelection = SelectionSort.run(arr);
        System.out.println(arrSelection);
        // BubbleSort
        System.out.println("");
        ArrayList<Integer> arrBubble = BubbleSort.run(arr);
        System.out.println(arrBubble);
    }
}
