package DSA.dynamicarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {
//    public static void main (String[] args){
//        List<Integer> myArr = new ArrayList<>();
//        myArr.add(1);
//        myArr.add(4);
//        myArr.add(7);
//        System.out.println("myArr size : " + myArr.size());
//        System.out.println("first element " + myArr.get(0));
//        System.out.println("second element " + myArr.get(1));
//        System.out.println("third element " + myArr.get(2));
//    }

    public static void main(String[] args) {
        DynamicArray dinamicArray = new DynamicArray();
        dinamicArray.add(0);
        dinamicArray.add(1);
        dinamicArray.add(2);
        dinamicArray.add(3);
        dinamicArray.add(4);
        dinamicArray.add(5);
        dinamicArray.add(6);
        dinamicArray.add(7);
        dinamicArray.add(8);
        dinamicArray.add(9);
        dinamicArray.add(10);
        dinamicArray.add(11);
        dinamicArray.print();
        System.out.println("\n\n\n");
        dinamicArray.remove(0);
        dinamicArray.print();
        dinamicArray.remove(1);
        dinamicArray.print();
        dinamicArray.remove(0);
        dinamicArray.print();
        dinamicArray.remove(4);
        dinamicArray.print();
        dinamicArray.remove(7);
        dinamicArray.print();

    }
//
//
//    private int[] array;
//    private int size;
//    private int max_size;
//
//    public DynamicArray() {
//        this(10);
//    }
//
//    public DynamicArray(int initialDimension) {
//        this.array = new int[initialDimension];
//        max_size = initialDimension;
//        size = 0;
//    }
//
//    public void add(int num) {
//        if (size < max_size - 1) {
//            array[size + 1] = num;
//            size++;
//        } else {
//            resize();
//        }
//    }
//
//    private void checkedIndex(int index) {
//        if (index < 0 || index > size - 1) {
//            throw new IndexOutOfBoundsException("Array out of bounds :" + index);
//        }
//    }
//
//    public int remove(int indexOf) {
//        if (indexOf < size) {
//            int tmp = array[indexOf];
//            array[indexOf] = 0;
//            size--;
//            return tmp;
//        }
//        throw new IndexOutOfBoundsException("Index out of bound");
//    }
//
//    private void resize() {
//        max_size *= 2;
//        int newArray[] = new int[max_size];
//        for (int i = 0; i < (max_size / 2); i++) {
//            newArray[i] = array[i];
//        }
//        array = newArray;
//    }
//
//    public void print() {
//        for (int i = 0; i < max_size; i++) {
//            System.out.println(array[i]);
//        }
//    }

    private int[] array;
    private int size;

    public DynamicArray() {
        this(10);
    }

    public DynamicArray(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("initial capacity not valid : " + initialCapacity);
        }
        array = new int[initialCapacity];
        size = 0;
    }

    public void add(int num) {
        checkToReAlloc();
        array[size++] = num;
    }

    public int get(int index) {
        checkIndex(index);
        return array[index];
    }

    public int size() {
        return size;
    }

    public int remove(int index) {
        checkIndex(index);
        int objToReturn = array[index];
        for (int i = index; i < size-1; i++) {
            array[i] = array[i+1];
        }
        size--;
        return objToReturn;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of boundary : " + index);
        }
    }

    private void checkToReAlloc() {
        if (size >= array.length) {
            int newCapacity = array.length * 2;
            int[] newArray = new int[newCapacity];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void print() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                s.append(array[i]);
            } else {
                s.append(array[i] + " - ");
            }
        }
        System.out.println(s);
    }
}
