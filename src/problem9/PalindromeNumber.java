package problem9;

public class PalindromeNumber {

    public static void main(String[] args) {

        PalindromeNumber palindromeNumber = new PalindromeNumber();

        System.out.println("121 è plaindroma? " + palindromeNumber.isPalindrome(1));
        System.out.println("3 è plaindroma? " + palindromeNumber.isPalindrome(3));
        System.out.println("13 è plaindroma? " + palindromeNumber.isPalindrome(13));
        System.out.println("1221 è plaindroma? " + palindromeNumber.isPalindrome(1221));
        System.out.println("12321 è plaindroma? " + palindromeNumber.isPalindrome(12321));
        System.out.println("1231321 è plaindroma? " + palindromeNumber.isPalindrome(1231321));
        System.out.println("1234321 è plaindroma? " + palindromeNumber.isPalindrome(1234321));
        System.out.println("1233321 è plaindroma? " + palindromeNumber.isPalindrome(1233321));
        System.out.println("1243521 è plaindroma? " + palindromeNumber.isPalindrome(1243521));
        System.out.println("1222 è plaindroma? " + palindromeNumber.isPalindrome(1222));
        System.out.println("12223 è plaindroma? " + palindromeNumber.isPalindrome(12223));

    }

    //SOLUZIONE OTTIMALE - con algoritmo per invertire un numbero : esempio input 345, output 543 -> confronto se sono uguali, è palindrome
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }

//    public boolean isPalindrome(int x) {
//
//        int[] cifre = numberToString(x);
//        if (cifre.length % 2 == 0) {
//            return checkPalindromeEven(cifre);
//        }
//        return checkPalindromeOdds(cifre);
//    }
//
//    //caso pari
//
//    //  123_21
//    private boolean checkPalindromeEven(int[] x) {
//        int center2 = x.length / 2;
//        int center1 = center2 - 1;
//        if (x[center2] == x[center1]) {
//            for (int i = center1 - 1, j = center2 + 1; i >= 0; i--, j++) {
//                if (!(x[i] == x[j]))
//                    return false;
//            }
//            return true;
//        }
//        return false;
//    }
//
//
//    //   22322
//    //  22 center 22
//    // center corrisponde esattamente a x.length/2 in quanto x[center] corrisponde proprio a 3 nell'input 22322 sarebbe insomma x[2].
//    private boolean checkPalindromeOdds(int[] x) {
//        if (x.length == 1) {
//            return true;
//        }
//        int center = (x.length / 2);
//        for (int i = center-1, j = center+1; i >=0; i--,j++){
//            if(!(x[i] == x[j])){
//                return false;
//            }
//        }
//        return true;
//    }
//
//
//    private int[] numberToString(int x) {
//        String numeroAsString = String.valueOf(x);
//        int[] cifre = new int[numeroAsString.length()];
//
//        for (int i = 0; i < numeroAsString.length(); i++) {
//            cifre[i] = Character.getNumericValue(numeroAsString.charAt(i));
//        }
//        return cifre;
//    }

//
//    public boolean isPalindrome(int x) {
//        String numeroAsString = String.valueOf(x);
//        int[] cifre = new int[numeroAsString.length()];
//
//        for(int i = 0; i<numeroAsString.length(); i++){
//            cifre[i] = Character.getNumericValue(numeroAsString.charAt(i));
//        }
//
//        if (cifre.length == 1) {
//            return true;
//        }
//        if(cifre.length%2 == 0)
//            return checkPalindromeEven(cifre);
//        else
//            return checkPalindromeOdd(cifre);
//    }
//
//    ///         1 2 2 1    center 4/2 -> 2
//    //lunghezza pari
//    private boolean checkPalindromeEven(int[] x) {
//        int center = x.length / 2;
//        int center2 = (x.length / 2) -1;
//        if (x[center] == x[center2]) {
//            for (int y = 1, z = 1; y < (x.length- center2); y++, z++) {
//                if (x[center + y] == x[center2 - z]) {
//                    continue;
//                } else {
//                    return false;
//                }
//            }
//            return true;
//        }
//        return false;
//    }
//
//    //lunghezza dispari
//    private boolean checkPalindromeOdd(int[] x) {
//        int center = x.length / 2;
//        for (int i = 1; i < (x.length - (center)); i++) {
//            if (x[center + i] == x[center - i])
//                continue;
//            else
//                return false;
//        }
//        return true;
//    }
//

}

