package zero_101_array.problem88;

import java.util.Arrays;

public class MergeSortedArray_ {
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

        int[] array3 = new int[9];
        array3[0] = -1;
        array3[1] = 0;
        array3[2] = 0;
        array3[3] = 3;
        array3[4] = 3;
        array3[5] = 3;
        array3[6] = 0;
        array3[7] = 0;
        array3[8] = 0;
        int[] array4 = new int[3];
        array4[0] = 1;
        array4[1] = 2;
        array4[2] = 2;
        MergeSortedArray_ mergeSortedArray = new MergeSortedArray_();
        mergeSortedArray.merge(array3, array3.length, array4, array4.length);
        System.out.println(Arrays.toString(array3));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            //TODO copy nums2 into nums1;
        }
        for (int i = 0; i < nums2.length; i++) {
            insertElement(nums1, nums2[i]);
        }

    }

    private void insertElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = element;
                return;
            }
            if (array[i] >= element) {
                shiftArray(array, i);
                array[i] = element;
                return;
            }
        }
    }

    private void shiftArray(int[] array, int indexToStart) {
        for (int i = array.length - 2; i >= indexToStart; i--) {
            array[i + 1] = array[i];
        }
    }
}