/**

345. Reverse Vowels of a String
https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75

**/

public class Solution {
    /**
     * Reverses the vowels in a given string.
     * 
     * @param s The input string.
     * @return The string with its vowels reversed.
     */
    public String reverseVowels(String s) {
        // Define a string containing all vowels
        String allVowels = "aeiouAEIOU"; 
        // Convert the input string to a character array for efficient manipulation
        char[] sb = s.toCharArray();
        // Initialize pointers to the start and end of the string
        int l = 0;
        int r = s.length() - 1;

        // Iterate through the string until the pointers meet
        while (l < r) {
            // Move the left pointer until a vowel is found or until it reaches the right pointer
            while (l < r && allVowels.indexOf(sb[l]) == -1) {
                l++;
            }

            // Move the right pointer until a vowel is found or until it reaches the left pointer
            while (l < r && allVowels.indexOf(sb[r]) == -1) {
                r--;
            }
            
            // Swap the vowels found by the left and right pointers
            char temp = sb[l];
            sb[l++] = sb[r];
            sb[r--] = temp;
        }

        // Convert the character array back to a string and return it
        return new String(sb);
    }
}
