package zero_101_array.problem977;

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        //int[] array = {-4, -1, 0, 3, 10};
        int[] array = {-4, -4, 3, -3, -1, 1, 0, 3, -10, 10, 10};

        SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();
        squaresOfSortedArray.sortedSquares(array);

    }

    public int[] sortedSquares(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = (int) Math.pow(nums[i], 2.0);
        }
        print(array);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("\n\nORDINO ARRAY :\n");
        print(array);
        return array;
    }

    private static void print(int[] array) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            s.append("position: " + i + "  value: " + array[i] + "\n");
        }
        System.out.println(s);
    }
}
/*
Migliore soluzione (Java, O(n)) — Due puntatori (Two Pointers)
Poiché l’array è già ordinato, i numeri negativi diventano grandi positivi una volta elevati al quadrato. Quindi:

Il quadrato più grande può essere all’inizio o alla fine dell’array.

Usiamo due puntatori:

Uno parte dall’inizio (left).

Uno dalla fine (right).

Riempiamo un nuovo array dalla fine all'inizio.

💡 Codice Java ottimizzato:
java
Copia
Modifica
public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }

        return result;
    }

    // Esempio di uso
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
🧠 Esempio pratico
Input:

css
Copia
Modifica
[-4, -1, 0, 3, 10]
Quadrati (non ordinati):

csharp
Copia
Modifica
[16, 1, 0, 9, 100]
Output ordinato:

csharp
Copia
Modifica
[0, 1, 9, 16, 100]
⏱️ Complessità:
Tempo: O(n) — una sola passata sull’array.

Spazio: O(n) — per l’array di output.
 */