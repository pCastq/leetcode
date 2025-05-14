package zero_101_array.problem88;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] array1 = new int[6];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        System.out.println("array1 : " + Arrays.toString(array1));

        int[] array2 = new int[3];
        array2[0] = 2;
        array2[1] = 5;
        array2[2] = 6;
        System.out.println("array2 : " + Arrays.toString(array2));


        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(array1, array1.length, array2, array2.length);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // caso nums1 1 solo elemento e nums2 zero
        int x = nums2.length;
        for(int i = nums1.length;
    }

}
