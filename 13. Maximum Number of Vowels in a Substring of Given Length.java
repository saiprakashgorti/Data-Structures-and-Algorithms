
/**

1456. Maximum Number of Vowels in a Substring of Given Length
https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/?envType=study-plan-v2&envId=leetcode-75

maxVowels method:
* This method takes a string s and an integer k as input and finds the maximum number of vowels in any substring of length k in the string.
* It initializes variables to store the maximum number of vowels (maximumVowels) and the count of vowels in the current substring (currentVowel).
* It iterates through the string s to count the number of vowels in the first substring of length k.
* It then iterates through the string starting from the (k+1)-th character, updating the count of vowels in each substring and updating the maximum number of vowels accordingly.
* Finally, it returns the maximum number of vowels found.

isVowel method:
* This method takes a character c as input and checks if it is a vowel (either lowercase or uppercase).
* It returns true if the character is a vowel and false otherwise.

**/


public class Solution {
    /**
     * Finds the maximum number of vowels in any substring of length k in the given string.
     * 
     * @param s The input string.
     * @param k The length of substrings.
     * @return The maximum number of vowels in any substring of length k.
     */
    public int maxVowels(String s, int k) {
        int maximumVowels = 0; // Initialize the maximum number of vowels
        int currentVowel = 0; // Initialize the count of vowels in the current substring
        char[] charArray = s.toCharArray(); // Convert the string to a character array

        // Count the number of vowels in the first substring of length k
        for (int i = 0; i < k; i++) {
            if (isVowel(charArray[i])) {
                currentVowel++;
            }
        }
        maximumVowels = currentVowel; // Set the maximum number of vowels to the count of vowels in the first substring

        // Iterate through the string starting from the (k+1)th character
        for (int i = k; i < charArray.length; i++) {
            // If the current character is a vowel, increment the count of vowels
            if (isVowel(charArray[i])) {
                currentVowel++;
            }
            // If the character k positions behind the current character is a vowel, decrement the count of vowels
            if (isVowel(charArray[i - k])) {
                currentVowel--;
            }
            // Update the maximum number of vowels if the current count of vowels is greater
            maximumVowels = Math.max(maximumVowels, currentVowel);
        }
        return maximumVowels; // Return the maximum number of vowels
    }
    
    /**
     * Checks if a character is a vowel.
     * 
     * @param c The character to check.
     * @return True if the character is a vowel, false otherwise.
     */
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
