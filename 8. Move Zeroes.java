/**

283. Move Zeroes
https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75

moveZeroes method:
* This method takes an integer array nums as input and moves all zeroes in the array to the end while maintaining the relative order of non-zero elements.
* It initializes a variable count to track the position where non-zero elements should be moved.
* It iterates through the array nums.
* If the current element is non-zero, it moves it to the position indicated by count and increments count.
* After processing all non-zero elements, it fills the remaining positions in the array with zeroes.
* This approach effectively moves all zeroes to the end of the array while preserving the order of non-zero elements and has a time complexity of O(n), where n is the length of the input array.

**/

public class Solution {
    /**
     * Moves all zeroes in the input array to the end while maintaining the relative order of non-zero elements.
     * 
     * @param nums The input array.
     */
    public void moveZeroes(int[] nums) {
        // Initialize a variable to track the position where non-zero elements should be moved
        int count = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, move it to the position indicated by 'count'
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        // Fill the remaining positions in the array with zeroes
        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
