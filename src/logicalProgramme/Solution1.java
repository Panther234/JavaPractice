package logicalProgramme;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */
/*
Write a function:
class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

import java.util.HashSet;
import java.util.Set;

class Solution1 {
    public static int solution(int[] A) {
        //special case
        if(A.length ==0){
            return 1;
        }
        // Using "set" to check if an element has appeared
        Set<Integer> set = new HashSet<Integer>();
        // add elements into the set
        for (int j : A) {
            set.add(j);
        }
        // note: the missing number is not possible bigger than (A.length)
        //       because there are only (A.length) numbers
        for(int i=1; i<= A.length; i++){
            if(!set.contains(i)) // the 1st missing element
                return i;
        }
        // means: there are no missing numbers from 1 to A.length
        // Therefore, the missing number is "A.length+1" (important)
        return A.length+1;

    }
}
