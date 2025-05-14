package zero_101_array.problem1089;

import java.util.Arrays;

/*
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.


Example 1:

Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]


Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 9

 */
public class DuplicateZeros {
    public static void main(String[] args) {

        DuplicateZeros duplicateZeros = new DuplicateZeros();
        int[] array = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros.duplicateZeros(array);
    }

    //scorro l'array, quando trovo uno zero faccio uno shift degli elementi e poi incrementerò l'array di 2.
    public void duplicateZeros(int[] arr) {
        System.out.println("array originale : \n" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                shiftArray(arr, i);
                i++;
            }
        }
        System.out.println("array finale : \n" + Arrays.toString(arr));
    }

    //come faccio lo shift?
    //ricevo l'array e la posizione dell'elemento che contiene 0
    //mi posiziono con i = alla posizione dell'ultimo elemento dell'array cioè arr.length-1
    // finchè i > della posizione dell'elemento che contiene 0
    //sposto gli elementi di una posizione.
    //esempio   index = 3  (l'elemento 0  -> è il quarto elemento dell'array quindi con indice 3)
    // mi posiziono alla fine , sposto tutti gli elementi fino a quando non arrivo all'indice 3.
    // questo significa che l'indice 4 ha copiato l'elemento di indice 3 e avrò già copiato, duplicato lo zero.
    //[1, 0, 2, 3, 0, 4, 5, 0]   originale
    //[1, 0, 0, 2, 3, 0, 4, 5]   primo shift
    //[1, 0, 0, 2, 3, 0, 0, 4]   secondo shift
    private void shiftArray(int[] arr, int index) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        System.out.println("shift elementi dell'array");
        System.out.println(Arrays.toString(arr));
    }

}
