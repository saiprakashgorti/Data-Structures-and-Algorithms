/**

334. Increasing Triplet Subsequence
https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75

increasingTriplet method:
* This method takes an integer array nums as input and determines whether there exists a triplet of numbers forming an increasing subsequence.
* It first checks if the array is null or has less than 3 elements. If so, it returns false because there can't be an increasing triplet in such cases.
* It initializes two variables a and b to store the first and second smallest elements initially set to Integer.MAX_VALUE.
* It iterates through the array nums.
* For each element in the array:
* * If the element is less than or equal to the first smallest element a, it updates a.
* * If the element is greater than a but less than or equal to the second smallest element b, it updates b.
* * If the element is greater than both a and b, it means an increasing triplet is found, so the method returns true.
* If no increasing triplet is found after iterating through the array, the method returns false.

**/

public class Solution {
    /**
     * Determines whether there exists a triplet of numbers in the array that form an increasing subsequence.
     * 
     * @param nums The input array of integers.
     * @return True if there exists a triplet of numbers forming an increasing subsequence, false otherwise.
     */
    public boolean increasingTriplet(int[] nums) {
        // If the array is null or has less than 3 elements, return false as there can't be an increasing triplet
        if (nums == null || nums.length < 3) {
            return false;
        }

        // Initialize two variables to store the first and second smallest elements
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        // Iterate through the array
        for (int num : nums) {
            // If the current number is less than or equal to the first smallest element, update the first smallest element
            if (num <= a) {
                a = num;
            } 
            // If the current number is greater than the first smallest element but less than or equal to the second smallest element,
            // update the second smallest element
            else if (num <= b) {
                b = num;
            } 
            // If the current number is greater than both the first and second smallest elements, an increasing triplet is found, so return true
            else {
                return true;
            }
        }

        // If no increasing triplet is found, return false
        return false;
    }
}
