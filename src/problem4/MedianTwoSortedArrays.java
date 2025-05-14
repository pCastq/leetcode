package problem4;

import java.util.Arrays;

public class MedianTwoSortedArrays {


    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3, 4, 7, 9};
        int[] nums2 = new int[]{2, 4, 6, 8, 10, 12};

        int[] nums3 = new int[]{1, 3};
        int[] nums4 = new int[]{2};

        int[] nums5 = new int[]{};
        int[] nums6 = new int[]{2};

        MedianTwoSortedArrays median2SortArrays = new MedianTwoSortedArrays();
        median2SortArrays.findMedianSortedArrays(nums1,nums2);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arraysLength = nums1.length + nums2.length;
        if (arraysLength == 0) {
            return 0;
        }
        if (arraysLength == 1) {
            return nums1.length == 0 ? nums2[0] : nums1[0];
        }
        if (arraysLength == 2) {
            return ((double) (arraysLength) / 2);
        }
        int[] mergedArray = new int[arraysLength];

        mergeAndSortArrays(nums1,nums2,mergedArray);

        //TODO
        return 0;
    }

    private void mergeAndSortArrays(int[] array1, int[] array2, int[] mergedArray) {
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        //quicksort
        quickSort(mergedArray, 0, mergedArray.length - 1);

        System.out.println("Array ordinato: " + Arrays.toString(mergedArray));
    }

    private void quickSort(int[] mergedArray, int low, int high) {
        if (low < high) {
            //partizionamento e ottenimento dell'indice del pivot
            int piv = partition(mergedArray, low, high);
            quickSort(mergedArray, low, piv - 1);
            quickSort(mergedArray, piv + 1, high);
        }
    }

    private int partition(int[] mergedArray, int low, int high) {
        int piv = mergedArray[high];  //ultimo elemento come pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (mergedArray[j] <= piv) {  // Se l'elemento è minore o uguale al pivot
                i++;
                // Scambiamo gli elementi
                int temp = mergedArray[i];
                mergedArray[i] = mergedArray[j];
                mergedArray[j] = temp;
            }
        }
        // Posizioniamo il pivot nella sua posizione corretta
        int temp = mergedArray[i + 1];
        mergedArray[i + 1] = mergedArray[high];
        mergedArray[high] = temp;
        return i + 1;
    }
}

//package problem4;
//
//public class MedianTwoSortedArrays {
//
//
//    public static void main(String[] args) {
//        int[] nums1 = new int[]{1, 3, 4, 7, 9};
//        int[] nums2 = new int[]{2, 4, 6, 8, 10, 12};
//
//        int[] nums3 = new int[]{1, 3};
//        int[] nums4 = new int[]{2};
//
//        int[] nums5 = new int[]{};
//        int[] nums6 = new int[]{2};
//
//        var x = MedianTwoSortedArrays.findMedianSortedArrays(nums3, nums4);
//        System.out.println("la mediana è : " + x);
//    }
//
//    // 2,2,2,2,2,4,4,4,4
//
////    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
////        double medArr1 = findMedianArray(nums1);
////        double medArr2 = findMedianArray(nums2);
////
////        if(i == 1){
////            return medArr2;
////        }else if( i == 2){
////            return 0.0;
////        }
////        return (medArr1 + medArr2) / 2.0;
////    }
//
//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        if(nums1.length == 0){
//            return findMedianArray(nums2);
//        }
//        if(nums2.length == 0){
//            return  findMedianArray(nums1);
//        }
//        return ((findMedianArray(nums1) + findMedianArray(nums2)) / 2.0 );
//    }
//
//    private static double findMedianArray(int[] arr) {
//        int medianIndex = arr.length / 2;
//        if (arr.length % 2 == 1) {
//            System.out.println("arr dispari median is " + arr[medianIndex]);
//            return ((double) arr[medianIndex]);
//        }
//        System.out.println("valore1 : " + arr[medianIndex - 1] + "   valore2 : " + arr[medianIndex]);
//
//        System.out.println("arr pari median is " + (arr[medianIndex - 1] + arr[medianIndex]) / 2.0);
//        return ((double)(arr[medianIndex - 1] + arr[medianIndex]) / 2.0);
//    }
//
//    private static void mergeArragy(int[] longestArray, int[] arr2){
//        int num;
//        for(int i=0; i<arr2.length; i++){
//            num = arr2[i];
//            for(int j=0; j<longestArray.length; j++){
//
//            }
//        }
//    }
//
//    private static int searchPositionToEnter(int[] array,int num){
//        int startPosition = 0;
//        int lastPosition = array.length;
//        int halfPosition = lastPosition/2;
//        int halfValue = array[halfPosition];
//
//        while(true){
//            if(num == halfValue){
//                return halfPosition;
//            }
//            if( num < halfValue){
//                startPosition = 0;
//                lastPosition = halfPosition;
//                halfValue =
//            }
//        }
//        for(int i=0; i<array.length; i++){
//
//        }
//    }
//}
