/**

1207. Unique Number of Occurrences
https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=study-plan-v2&envId=leetcode-75

uniqueOccurrences method:
* This method takes an integer array arr as input and determines whether the occurrences of each distinct element in the array are unique.
* It initializes a HashMap map to store the count of occurrences for each distinct element and a HashSet set to store the count of occurrences, ensuring uniqueness.
* It iterates through the array and counts the occurrences of each distinct element, storing the counts in the HashMap.
* It then iterates through the counts in the HashMap:
* * If a count is already present in the HashSet, it means occurrences are not unique, so the method returns false.
* * Otherwise, it adds the count to the HashSet to track uniqueness.
* If all counts are unique, the method returns true.

**/

import java.util.*;

public class Solution {
    /**
     * Determines whether the occurrences of each distinct element in the array are unique.
     * 
     * @param arr The input array of integers.
     * @return True if the occurrences of each distinct element are unique, false otherwise.
     */
    public boolean uniqueOccurrences(int[] arr) {
        // Create a HashMap to store the count of occurrences for each distinct element
        Map<Integer, Integer> map = new HashMap<>();
        // Create a HashSet to store the count of occurrences, ensuring uniqueness
        Set<Integer> set = new HashSet();

        // Count occurrences of each distinct element and store in the HashMap
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        // Check if the count of occurrences for each distinct element is unique
        for (int n : map.keySet()) {
            // If the count is already present in the HashSet, occurrences are not unique, so return false
            if (set.contains(map.get(n))) {
                return false;
            }
            // Add the count to the HashSet to track uniqueness
            set.add(map.get(n));
        }

        // If all counts are unique, return true
        return true;
    }
}
