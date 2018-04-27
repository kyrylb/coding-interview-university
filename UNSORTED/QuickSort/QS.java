package algs.vaadin;

import java.util.Arrays;

/**
 * Created by sagittarius on 4/15/2018.
 */
public class QS {
    public static int[] arr = new int[]{6,7,4,2,3,8,9,0,5};

    public static void main(String[] args) {
        //shuffling here
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int lo, int hi) {
        int i = lo;
        int j = hi;
        int k = (lo + hi)/2;

        while (i < j) {
            while(arr[i] <= arr[k] && i < k) {
                i++;
            }

            while(arr[j] >= arr[k] && j > k) {
                j--;
            }

            if (i <= j) {
                exch(arr, i, j);
                i++;
                j--;
            }
        }

        if (j > lo) sort(arr, lo, j);
        if (i < hi) sort(arr, i, hi);
    }


    public static void sort2(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int j = partition(arr, lo, hi);
        sort2(arr, lo, j-1);
        sort2(arr, j+1, hi);
    }

    public static int partition(int[] arr, int lo, int hi) {
        int i = lo;
        int j = hi + 1;

        while(true) {
            while (arr[++i] < arr[lo]) {
                if (i == hi) {
                    break;
                }
            }

            while (arr[--j] > arr[lo]) {
                //redundant
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }
            exch(arr, i, j);
        }

        exch(arr, lo, j);
        return j;

    }

    public static void exch(int[] arr, int p, int q) {
        int copy = arr[p];
        arr[p] = arr[q];
        arr[q] = copy;
    }

}
