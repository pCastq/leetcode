package zero_101_array.problem88;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] array1 = new int[6];
        array1[0] = 1;
        array1[1] = 3;
        array1[2] = 5;
        System.out.println("array1 : " + Arrays.toString(array1));


        int[] array2 = new int[2];
        array2[0] = 0;
        array2[1] = 7;

        System.out.println("array2 : " + Arrays.toString(array2));

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(array1, 3, array2, 2);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        //suppongo che il secondo array ha elemento != da zero,
        //allora trasferisco in nums1 e returns;
        if (m == 0 && nums2[0] != 0) {
            transferToNums1(nums1, m, nums2, n);
            return;
        }
        //m == 0 e non è entrato nell'if di prima allora
        // posso ritornare nums1 per esclusione
        if (m == 0) {
            return;
        }
        toMerge(nums1,m,nums2,n);
    }

    public void toMerge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums2[i] <= nums1[j]) {
                    shiftElement(nums1, j);
                    nums1[j] = nums2[i];
                    m++;
                    break;
                } else {
                    if (j == (m - 1)) {
                        shiftElement(nums1, j);
                        nums1[j + 1] = nums2[i];
                        m++;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public void shiftElement(int[] nums1, int startFromIndex) {
        for (int i = nums1.length - 1; i > startFromIndex; i--) {
            nums1[i] = nums1[i - 1];
            System.out.println(Arrays.toString(nums1));
        }
    }

    public void transferToNums1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i] = nums2[i];
        }
    }
}

