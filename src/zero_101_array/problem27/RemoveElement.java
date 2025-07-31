package zero_101_array.problem27;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(arr, val));
        System.out.println(Arrays.toString(arr));
    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        int arr_length = nums.length;
        for (int i = 0; i < arr_length; i++) {
            if (nums[i] != val) {
                count++;
            }
            while (nums[i] == val) {
                if (i < arr_length) {
                    shiftElement(nums, i);
                    arr_length--;
                    if (nums[i] != val) {
                        count++;
                        break;
                    }
                }else {
                    break;
                }
            }
        }
        return count;
    }

    private void shiftElement(int arr[], int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }
}



/* SOLUZIONE OTTIMALE CLAUDE

Strategia ottimale: Two Pointers
La soluzione migliore usa la tecnica dei due puntatori:

Un puntatore (i) scorre tutto l'array
Un puntatore (k) tiene traccia della posizione dove inserire il prossimo elemento valido
Come funziona l'algoritmo:

Inizializzazione: k = 0 (puntatore per gli elementi validi)
Ciclo principale: Per ogni elemento nums[i]:

Se nums[i] != val:

Copia nums[i] in posizione nums[k]
Incrementa k


Se nums[i] == val:

Lo ignora e passa al prossimo


Risultato: Restituisce k (numero di elementi validi)

Esempio pratico con nums = [3,2,2,3], val = 3:
Inizio: nums = [3,2,2,3], k = 0

i=0: nums[0]=3, 3==3 → saltiamo, k=0
i=1: nums[1]=2, 2≠3 → nums[0]=2, k=1
i=2: nums[2]=2, 2≠3 → nums[1]=2, k=2
i=3: nums[3]=3, 3==3 → saltiamo, k=2

Risultato: nums = [2,2,2,3], k=2
I primi k=2 elementi sono [2,2] ✅
Complessità

Tempo: O(n) - un solo passaggio attraverso l'array
Spazio: O(1) - modifica in-place, nessuno spazio extra

Questa è la soluzione più efficiente possibile per questo problema!
 */
/*

public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Puntatore per la posizione di inserimento

        // Scorri tutto l'array con il puntatore i
        for (int i = 0; i < nums.length; i++) {
            // Se l'elemento corrente è diverso da val
            if (nums[i] != val) {
                // Copialo nella posizione k e incrementa k
                nums[k] = nums[i];
                k++;
            }
            // Se nums[i] == val, semplicemente lo saltiamo
        }

        return k; // Restituisce il numero di elementi validi
    }
}

// Esempio di test
class TestRemoveElement {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Esempio 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = solution.removeElement(nums1, val1);
        System.out.println("Esempio 1:");
        System.out.println("k = " + k1); // Output: 2
        System.out.print("nums = [");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + (i < k1-1 ? ", " : ""));
        }
        System.out.println("]"); // Output: [2, 2]

        // Test Esempio 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = solution.removeElement(nums2, val2);
        System.out.println("\nEsempio 2:");
        System.out.println("k = " + k2); // Output: 5
        System.out.print("nums = [");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + (i < k2-1 ? ", " : ""));
        }
        System.out.println("]"); // Output: [0, 1, 3, 0, 4]
    }
}
 */