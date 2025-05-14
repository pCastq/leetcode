package zero_101_array;

import java.util.Arrays;

public class Prove {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 9; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i-1];
        }
        System.out.println(Arrays.toString(array));
    }
}
