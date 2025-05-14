package problem3;


import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {

    //    dvdf
//  "abbcabcbb"
//  "pwwkew"


    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }


    // work good *******************************************
//    public static int lengthOfLongestSubstring(String s) {
//        if (s == "" || s == null) {
//            return 0;
//        }
//        int result = 1;
//        Set <Character> tmp = new HashSet<>();
//        for (int i = 0; i < s.length() - 1; i++) {
//            tmp.add(s.charAt(i));
//            for (int j = i + 1; j < s.length(); j++) {
//                if (tmp.contains(s.charAt(j))) {
//                    tmp.clear();
//                    break;
//                }
//                tmp.add(s.charAt(j));
//                if (tmp.size() > result) {
//                    result = tmp.size();
//                    System.out.println(tmp);
//                }
//            }
//        }
//        return result;
//    }


    //work with list*******************************************
//    public static int lengthOfLongestSubstring(String s) {
//        if (s == "" || s == null) {
//            return 0;
//        }
//        int result = 1;
//        List tmp = new ArrayList();
//        for (int i = 0; i < s.length() - 1; i++) {
//            tmp.add(s.charAt(i));
//            for (int j = i + 1; j < s.length(); j++) {
//                if (tmp.contains(s.charAt(j))) {
//                    tmp.clear();
//                    break;
//                }
//                tmp.add(s.charAt(j));
//                if (tmp.size() > result) {
//                    result = tmp.size();
//                    System.out.println(tmp);
//                }
//            }
//        }
//        return result;
//    }


//    public static int lengthOfLongestSubstring(String s) {
//        int result = 0;
//        Set<Character> set = new HashSet<>();
//        int count = 0;
//        for (Character c : s.toCharArray()) {
//            if (set.contains(c)) {
//                count = 1;
//            } else {
//                set.add(c);
//                count++;
//                if (count > result) {
//                    result = count;
//                }
//            }
//        }
//        return result;
//    }

//    {
//        Set <Character> set = new HashSet<>();
//        int lengthSubstring = 1;
//        int count = 0;
//        int actualLength = 0;
//        char previousCharacter= ' ';
//        for(Character c : s.toCharArray()){
//            if(c==previousCharacter){
//                count = 1;
//            }else{
//                previousCharacter = c;
//                count++;
//                if(count > lengthSubstring ){
//                    lengthSubstring = count;
//                }
//            }
//            set.add(c);
//        }
//        return lengthSubstring;
//    }

//    {
//        int lengthSubstring = 0;
//        int count = 0;
//        char actualC = s.charAt(0);
//        for (int i = 1; i < s.length(); i++) {
//            if (s.charAt(i) == actualC) {
//                count = 0;
//            } else {
//                count++;
//                if (count > lengthSubstring) {
//                    lengthSubstring = count;
//                }
//            }
//            actualC = s.charAt(i);
//        }
//    return lengthSubstring;
//    }
//
//

//        Set<Character> set = new HashSet<>();
//        for(char c : s.toCharArray()){
//            if(set.contains(c)){
//            }
//            else {
//                set.add(c);
//            }
//        }
//        return  set.size();


//            if(map.get(c) == null){
//                map.put(c,1);
//            }
//            else {
//                map.merge(c, 1, Integer::sum);
//            }

//        return (int)map.entrySet().stream().filter(entry -> entry.getValue()==1).count();


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("dvv"));
    }
}
