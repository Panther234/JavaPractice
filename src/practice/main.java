package practice;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

/*
Coding Exercise

Find the second largest number in an integer array. You can assume a minimum array length of one.

Test #1
Input: 1, 2, 4, 10 ,6
Output: 6

Test #2
Input: 100, 102
Output: 100

Test #3
Input: 99, 2, 50, 10 ,6, 10, 2
Output: 50

Test #4
Input: 5
Output: 5
*/

import java.util.Arrays;
import java.util.stream.Collectors;

class main {

        public static int findSecondLargest(int[] numArray) {
//            int largest = numArray[0];
//            int secondLargest = numArray[0];
//
//            System.out.print("\nInput: ");
//            for (int i = 0; i < numArray.length; i++){
//                System.out.print(numArray[i] + ",");
//            }
//            for (int i =0; i < numArray.length; i++){
//                if (numArray[i] > largest){
//                    secondLargest = largest;
//                    largest = numArray[i];
//                } else if (numArray[i] > secondLargest){
//                    secondLargest = numArray[i];
//                }
//            }
//            System.out.println("\nOutput : " + secondLargest);
//            return secondLargest ;
            System.out.println("Input array: " + Arrays.toString(numArray));
            if (numArray.length == 1) { // If array length is 1, then only the one element in the array should be returned
                System.out.println("Second largest number in array is: " + numArray[0]);
                return numArray[0];
            }
            Integer ans = Arrays.stream(numArray).boxed().sorted().collect(Collectors.toList()).get(numArray.length - 2);
            // Sort the array, collect the Stream<Integer> into a List<Integer>,
            // then get the second-last element in the event that the array length is greater than 1
            System.out.println("Second largest number in array is: " + ans);
            return ans;
        }

















        // These are the tests we use to determine if the solution is correct.
        // You can add your own at the bottom, but they are otherwise not editable!
        int test_case_number = 1;
        void check(int expected, int output) {
            boolean result = (expected == output);
            char rightTick = '\u2713';
            char wrongTick = '\u2717';
            if (result) {
                System.out.println(rightTick + " Test #" + test_case_number);
            }
            else {
                System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
                System.out.print(expected);
                System.out.print(" Your output: ");
                System.out.print(output);
                System.out.println();
            }
            test_case_number++;
        }

        public void run() {
            int[] array_1 = new int[] {1, 2, 4, 10 ,6};

            int expected_1 = 6;
            int output_1 = findSecondLargest(array_1);
            check(expected_1, output_1);

            int[] array_2 = new int[] {100, 102};
            int expected_2 = 100;
            int output_2 = findSecondLargest(array_2);
            check(expected_2, output_2);

            int[] array_3 = new int[] { 99, 2, 50, 10 ,6, 10 };
            int expected_3 = 50;
            int output_3 = findSecondLargest(array_3);
            check(expected_3, output_3);

            int[] array_4 = new int[] { 5 };
            int expected_4 = 5;
            int output_4 = findSecondLargest(array_4);
            check(expected_4, output_4);
        }

        public static void main(String[] args) {
            new main().run();
        }
    }

