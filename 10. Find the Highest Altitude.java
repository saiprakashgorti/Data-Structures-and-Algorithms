/**

1732. Find the Highest Altitude
https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75

largestAltitude method:
* This method takes an integer array gain as input, where each element represents the altitude gain at a particular step of the journey.
* It initializes a variable max to track the maximum altitude reached. The initial value is set to the altitude gain at the first step.
* It iterates through the altitude gains starting from the second step (i = 1).
* For each step, it updates the altitude gain at the current step to be the cumulative gain from the previous steps plus the current gain (gain[i] = gain[i] + gain[i - 1]).
* It updates the maximum altitude reached (max) if the current altitude is higher than the previously recorded maximum.
* Finally, it returns the maximum altitude reached during the journey. If the maximum altitude is negative, it returns 0 to ensure that the altitude is always non-negative.

**/

public class Solution {
    /**
     * Calculates the largest altitude reached during a journey.
     * 
     * @param gain An array representing the altitude gains at each step of the journey.
     * @return The maximum altitude reached during the journey.
     */
    public int largestAltitude(int[] gain) {
        // Initialize a variable to track the maximum altitude reached
        int max = gain[0];
        
        // Iterate through the altitude gains
        for (int i = 1; i < gain.length; i++) {
            // Update the altitude gain at the current step to be the cumulative gain
            // from the previous steps plus the current gain
            gain[i] = gain[i] + gain[i - 1];
            
            // Update the maximum altitude reached if the current altitude is higher
            max = Math.max(max, gain[i]);
        }
        
        // Return the maximum altitude reached during the journey
        // Ensure that the altitude never goes below 0
        return Math.max(max, 0);
    }
}
