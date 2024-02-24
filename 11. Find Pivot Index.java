/**

724. Find Pivot Index
https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75

pivotIndex method:
* This method takes an integer array nums as input and finds the index of the pivot element, where the sum of elements to the left equals the sum of elements to the right.
* If the input array is null or empty, the method returns -1, indicating that no pivot element exists.
* It initializes variables lsum and rsum to track the sum of elements to the left and right of the current index, respectively.
* The method iterates through the array twice:
* * In the first iteration, it calculates the sum of all elements in the array and stores it in rsum.
* * In the second iteration, it iterates through the array and:
* * * Updates rsum by subtracting the current element.
* * * Checks if lsum equals rsum. If they are equal, it returns the current index as the pivot index.
* * * Adds the current element to lsum for the next iteration.
* If no pivot index is found, the method returns -1.

**/

public class Solution {
    /**
     * Finds the index of the pivot element in an array.
     * 
     * @param nums The input array.
     * @return The index of the pivot element if found, otherwise -1.
     */
    public int pivotIndex(int[] nums) {
        // If the array is null or empty, return -1 indicating no pivot element exists
        if (nums == null || nums.length == 0) {
            return -1;
        }

        // Get the length of the array
        int n = nums.length;
        // Initialize variables to track the sum of elements to the left and right of the current index
        int lsum = 0;
        int rsum = 0;
        
        // Calculate the sum of all elements in the array
        for (int i = 0; i < n; i++) {
            rsum += nums[i];
        }

        // Iterate through the array to find the pivot index
        for (int i = 0; i < n; i++) {
            // Subtract the current element from the right sum to get the sum of elements to the right of the current index
            rsum -= nums[i];
            // If the sum of elements to the left equals the sum of elements to the right, return the current index as the pivot index
            if (lsum == rsum) {
                return i;
            }
            // Add the current element to the left sum for the next iteration
            lsum += nums[i];
        }

        // If no pivot index is found, return -1
        return -1;
    }
}
