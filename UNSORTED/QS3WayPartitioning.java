package algs.vaadin;

import java.util.Arrays;

/**
 * Created by sagittarius on 4/24/2018.
 */
public class QS3WayPartitioning {
    public static char[] arr = new char[] {'R','E','G','D','Y','R','T','D','P','H','I','R','F'};

    public static void main(String[] args) {
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(char[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int lt = lo;
        int gt = hi;
        int i = lo;

        while(i <= gt) {
            if (arr[i] < arr[lt]) {
                exch(arr, i++, lt++);
            } else if (arr[i] > arr[lt]) {
                exch(arr, i, gt--);
            } else {
                i++;
            }
        }
        sort(arr, lo, lt - 1);
        sort(arr, gt + 1, hi);
    }

    public static void exch(char[] arr, int p, int q) {
        char copy = arr[p];
        arr[p] = arr[q];
        arr[q] = copy;
    }
}
