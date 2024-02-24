/**

238. Product of Array Except Self
https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75

reverseWords method:
* This method takes a string s as input and reverses the order of words in it.
* It initializes the length of the input string len.
* It creates an empty list list to store individual words extracted from the string.
* It initializes a pointer l to traverse the string.
* It iterates through the string using the pointer l until it reaches the end.
* Within the loop:
* It extracts the current word by traversing characters until a space is encountered.
* It moves the pointer l past any consecutive spaces.
* If the current word is not empty, it adds it to the list of words.
* After the loop, it initializes an empty string s to store the result.
* It iterates through the list of words in reverse order and appends them to the result string with spaces in between.
* Finally, it trims any trailing spaces from the result string and returns it.

**/


public class Solution {
    /**
     * Computes the product of all elements in the array except for the current element.
     * 
     * @param nums The input array.
     * @return An array where each element at index i is the product of all elements in
     *         the input array except for the element at index i.
     */
    public int[] productExceptSelf(int[] nums) {
        // Initialize variables to track the product, presence of zero, and count of zeros
        int product = 1;
        boolean containsOneZero = false;
        int count = 0;

        // Compute the product of all elements and check for the presence of zero(s)
        for (int n : nums) {
            if (n == 0) {
                count++;
                containsOneZero = true;
            } else {
                product *= n;
            }
        }

        // Update the elements of the input array based on the computed product and zero count
        for (int i = 0; i < nums.length; i++) {
            if (count > 1) {
                // If there are more than one zero(s), all elements should be 0
                nums[i] = 0;
            } else if (containsOneZero) {
                // If there is one zero, set the element to the product if it's zero,
                // otherwise set it to 0
                if (nums[i] == 0) {
                    nums[i] = product;
                } else {
                    nums[i] = 0;
                }
            } else {
                // Otherwise, set the element to the quotient of the product divided by the element
                nums[i] = product / nums[i];
            }
        }

        return nums; // Return the modified array
    }
}
