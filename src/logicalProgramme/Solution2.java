package logicalProgramme;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */
//        Given an unordered array of integers of length N > 0, calculate the length of the
//        longest ordered (ascending from left [lower index] to right [higher index])
//        subsequence within the array.
//
//        Example 1
//        Input: [1,4,1,4,2,1,3,5,6,2,3,7]
//        Expected Output: 4
//
//        Example 2
//        Input: [3,1,4,1,5,9,2,6,5,3,5]
//        Expected Output: 3
//
//        Example 3
//        Input: [2,7,1,8,2,8,1]
//        Expected Output: 2

public class Solution2 {
    public static int maxLength(int[] array) {
        int len = 0; // Length of the longest ordered array
        for (int x = 0; x < array.length; x++) {
            int buffLen = 1;

            for (int y = x; y < array.length - 1; y++) {
                if (array[y+1] >= array[y]) {
                    buffLen++;
                    if (buffLen > len) len = buffLen;
                } else break;
            }
        }
        return len;
    }
    public static void main(String[] args) {
        System.out.println("Output of Example 1: " + maxLength(new int[]{1,4,1,4,2,1,3,5,6,2,3,7}));
        System.out.println("Output of Example 2: " + maxLength(new int[]{3,1,4,1,5,9,2,6,5,3,5}));
        System.out.println("Output of Example 3: " + maxLength(new int[]{2,7,1,8,2,8,1}));
    }
}
