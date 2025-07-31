package zero_101_array.problem88;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    private MergeSortedArray sut;

    @BeforeEach
    void setup() {
        sut = new MergeSortedArray();
    }

    @Test
    void testShiftElementFromIndex1() {
        int[] arr = {1, 3, 5, 0, 0};
        sut.shiftElement(arr, 1);

        assertArrayEquals(new int[]{1, 3, 3, 5, 0}, arr); // Verifica che l'array sia stato modificato correttamente
    }

    @Test
    void testShiftElementFromIndex0() {
        int[] arr = {1, 3, 5, 0, 0};
        sut.shiftElement(arr, 0);

        assertArrayEquals(new int[]{1, 1, 3, 5, 0}, arr); // Verifica che l'array sia stato modificato correttamente
    }

    @Test
    void testToMerge() {
        int[] arr1 = {1, 3, 5, 0, 0};
        int[] arr2 = {7, 8};
        sut.toMerge(arr1, 3, arr2, 2);

        assertArrayEquals(new int[]{1, 3, 5, 7, 8}, arr1); // Verifica che l'array sia stato modificato correttamente
    }

    @Test
    void testToMerge2() {
        int[] arr1 = {1, 3, 5, 0, 0};
        int[] arr2 = {0};
        sut.toMerge(arr1, 3, arr2, 1);

        assertArrayEquals(new int[]{0, 1, 3, 5, 0}, arr1); // Verifica che l'array sia stato modificato correttamente
    }

    @Test
    void testToMerge3() {
        int[] arr1 = {1, 3, 5, 0, 0};
        int[] arr2 = {0, 0};
        sut.toMerge(arr1, 3, arr2, 2);

        assertArrayEquals(new int[]{0, 0, 1, 3, 5}, arr1); // Verifica che l'array sia stato modificato correttamente
    }

    @Test
    void testToMerge4() {
        int[] arr1 = {1, 3, 5, 7, 0, 0, 0, 0,0};
        int[] arr2 = {0, 7, 7, 8};
        sut.toMerge(arr1, 4, arr2, 4);

        assertArrayEquals(new int[]{0, 1, 3, 5, 7, 7, 7, 8,0}, arr1); // Verifica che l'array sia stato modificato correttamente
    }


}
