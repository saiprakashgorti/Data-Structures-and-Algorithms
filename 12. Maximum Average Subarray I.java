/**

643. Maximum Average Subarray I
https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75

findMaxAverage method:
* This method takes an array of integers nums and an integer k as input and finds the maximum average of subarrays of length k within the array.
* It initializes the avg variable to store the sum of the first k elements of the array and calculates their average.
* The initial average is stored as the maxAvg variable, representing the maximum average found so far.
* It iterates through the array starting from the (k+1)-th element.
* For each iteration:
* * It updates the previous average by adding the current element and subtracting the element (i-k) steps behind, then dividing by k to maintain the length of the subarray.
* * It updates the maxAvg if the current average is greater than the previously recorded maximum average.
* After iterating through the array, it returns the maximum average found.

**/

public class Solution {
    /**
     * Finds the maximum average of subarrays of length k within the given array.
     * 
     * @param nums The input array of integers.
     * @param k The length of subarrays.
     * @return The maximum average of subarrays of length k.
     */
    public double findMaxAverage(int[] nums, int k) {
        // Initialize the average variable to store the sum of the first k elements
        double avg = 0;
        for (int i = 0; i < k; i++) {
            avg += nums[i];
        }
        avg /= k; // Calculate the average of the first k elements
        
        // Store the initial average as the maximum average found so far
        double maxAvg = avg;

        // Iterate through the array starting from the (k+1)th element
        for (int i = k; i < nums.length; i++) {
            // Update the previous average by adding the current element and subtracting the (i-k)th element
            avg += ((double)(nums[i] - nums[i - k]) / k);
            // Update the maximum average if the current average is greater
            maxAvg = Math.max(maxAvg, avg);
        }
        
        return maxAvg; // Return the maximum average
    }
}
