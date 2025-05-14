package zero_101_array.problem485;

/*
Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 */
public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        //int[] nums = {1, 1, 0, 1, 1, 1};
//        int[] nums = {0, 1};
        //int[] nums = {0, 0};
        int[] nums = {1, 1, 1, 0, 1, 0, 0, 1};

        System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1 && nums[0] == 1) {
            return 1;
        }
        if (nums.length == 1 && nums[0] == 0) {
            return 0;
        }
        int totalConsecutiveOnes = 0;
        int parzialConsecutiveOnes = 0;
        int i = 0;
        while (true) {
            if (i == nums.length) {
                break;
            }
            if (totalConsecutiveOnes >= nums.length - i) {
//                System.out.println("total consecutive ones :" + totalConsecutiveOnes);
//                System.out.println("valuto l'elemento i-esimo :" + i);
//                System.out.println("lunghezza restante da valutare : " + (nums.length - i + 0));
                break;
            }
            if (nums[i] == 1) {
                parzialConsecutiveOnes++;
                if (i == nums.length - 1) {
                    if (parzialConsecutiveOnes >= totalConsecutiveOnes) {
                        totalConsecutiveOnes = parzialConsecutiveOnes;
                    }
                    break;
                }
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 1) {
                        parzialConsecutiveOnes++;
                        if (j == nums.length - 1) {
                            if (parzialConsecutiveOnes >= totalConsecutiveOnes) {
                                totalConsecutiveOnes = parzialConsecutiveOnes;
                            }
                            parzialConsecutiveOnes = 0;
                            i++;
                            break;
                        }
                    } else {
                        if (parzialConsecutiveOnes >= totalConsecutiveOnes) {
                            totalConsecutiveOnes = parzialConsecutiveOnes;
                        }
                        parzialConsecutiveOnes = 0;
                        i++;
                        break;
                    }
                }
            } else {
                i++;
            }

        }
        return totalConsecutiveOnes;
    }

//    public int findMaxConsecutiveOnes(int[] nums) {
//        if (nums.length == 0) {
//            return 0;
//        }
//        if (nums.length == 1 && nums[0] == 1) {
//            return 1;
//        }
//        if (nums.length == 1 && nums[0] == 0) {
//            return 0;
//        }
//        int totalConsecutiveOnes = 0;
//        int parzialConsecutiveOnes = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1) {
//                parzialConsecutiveOnes++;
//                if (i == nums.length - 1) {
//                    if (parzialConsecutiveOnes >= totalConsecutiveOnes) {
//                        totalConsecutiveOnes = parzialConsecutiveOnes;
//                    }
//                    break;
//                }
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[j] == 1) {
//                        parzialConsecutiveOnes++;
//                        if (j == nums.length - 1) {
//                            if (parzialConsecutiveOnes >= totalConsecutiveOnes) {
//                                totalConsecutiveOnes = parzialConsecutiveOnes;
//                            }
//                            parzialConsecutiveOnes = 0;
//                        }
//                    } else {
//                        if (parzialConsecutiveOnes >= totalConsecutiveOnes) {
//                            totalConsecutiveOnes = parzialConsecutiveOnes;
//                        }
//                        parzialConsecutiveOnes = 0;
//                        break;
//                    }
//                }
//            } else {
//                parzialConsecutiveOnes = 0;
//            }
//        }
//        return totalConsecutiveOnes;
//    }
}


// 0 to n
//i = boundary ?? // yes -> write max consecutive 1
// no -> continue;

// i == 1 ok   count ++
// j = i+1
// j == 1 ?        si  count ++                     no ->  go to next i
//check if we are on boundary
// yes -> write max consecutive 1
// no -> go next j

//no ->  i++;
