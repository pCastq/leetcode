package zero_101_array.problem1295;

/*
Given an array nums of integers, return how many of them contain an even number of digits.
Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
Example 2:


Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.
* */
public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        FindNumbersWithEvenNumberOfDigits findNumbersWithEvenNumberOfDigits = new FindNumbersWithEvenNumberOfDigits();
        int[] array = {12,345,2,6,7896};

        var t = findNumbersWithEvenNumberOfDigits.findNumbers(array);
        System.out.println(t);
    }

    public int findNumbers(int[] nums) {
        int countDigits = 1;
        int totalEven = 0;
        for (int num : nums) {
            while (num / 10 > 0) {
                countDigits++;
                num /= 10;
            }
            if (countDigits % 2 == 0) {
                totalEven++;
            }
            countDigits = 1;
        }
        return totalEven;
    }
}
