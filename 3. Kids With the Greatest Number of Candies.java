/**

1431. Kids With the Greatest Number of Candies

public List<Boolean> kidsWithCandies(int[] candies, int extraCandies):
* This method takes two parameters: an integer array candies representing the current number of candies each kid has, and an integer extraCandies representing the extra candies that can be given to any kid.
* It initializes an ArrayList called result to store the boolean values indicating whether each kid can have the greatest number of candies.
* It initializes a variable max to store the maximum number of candies among all kids, initially set to the number of candies the first kid has (candies[0]).
* It then iterates through the candies array starting from the second element (i=1) and updates the max variable to be the maximum of the current max and the number of candies at index i.
* After finding the maximum number of candies, it iterates through the candies array again and adds a boolean value to the result list for each kid. The boolean value is true if adding extraCandies to the current kid's candies would make their total candies greater than or equal to the maximum (candies[i] + extraCandies >= max), indicating they can have the greatest number of candies; otherwise, it's false.
* Finally, it returns the result list containing boolean values indicating which kids can have the greatest number of candies.

**/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * Determines which kids can have the greatest number of candies among themselves
     * if they are given extra candies.
     * 
     * @param candies      An array representing the current number of candies each kid has.
     * @param extraCandies An integer representing the extra candies that can be given to any kid.
     * @return A list of boolean values indicating whether each kid can have the greatest
     *         number of candies (true) or not (false) if given extra candies.
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Initialize a list to store the result
        List<Boolean> result = new ArrayList<>();
        
        // Find the maximum number of candies among all kids
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }

        // Determine if each kid can have the greatest number of candies with extra candies
        for (int i = 0; i < candies.length; i++) {
            // Add a boolean value to the result list based on the comparison
            result.add(candies[i] + extraCandies >= max);
        }

        // Return the list containing boolean values indicating which kids can have the greatest number of candies
        return result;
    }
}
