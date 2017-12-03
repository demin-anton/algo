package ademin.algo;

import ademin.algo.sort.BubbleSort;
import ademin.algo.sort.InsertionSort;
import ademin.algo.sort.MergeSort;
import ademin.algo.sort.SelectionSort;

import java.util.ArrayList;

/**
 * Created by ADemin on 12.12.2016.241234123ваы
 */
public class TestAlgs {
    public static void main(String[] args) {
        //
        System.out.println("Array:");
        int arr[] = MyArr.getArr(200000);
        //MyArr.print(arr);
        // MergeSort
        System.out.println("");
        int[] arrMerge = MergeSort.run(arr);
        //MyArr.print(arrMerge);
        // InsertionSort
        System.out.println("");
        int[] arrInsertion = InsertionSort.run(arr);
        //MyArr.print(arrInsertion);
        // SelectionSort
        System.out.println("");
        int[] arrSelection = SelectionSort.run(arr);
        //MyArr.print(arrSelection);
        // BubbleSort
        System.out.println("");
        int[] arrBubble = BubbleSort.run(arr);
        //MyArr.print(arrBubble);
    }
}
