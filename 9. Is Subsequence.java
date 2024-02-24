/**

392. Is Subsequence
https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=leetcode-75

isSubsequence method:
* This method takes two strings, s and t, as input and determines whether s is a subsequence of t.
* If s is null or empty, it is considered a subsequence of any string, so the method returns true in this case.
* If the length of s is greater than the length of t, s cannot be a subsequence of t, so the method returns false.
* The method initializes a pointer i to traverse string s.
* It iterates through string s.
* For each character in s, it finds the index of that character in t.
* If the character is found in t, it updates t to exclude the characters before the found index (using substring) and moves to the next character in s.
* If the character is not found in t, s is not a subsequence of t, and the method returns false.
* If all characters in s are found in t in the correct order, s is a subsequence of t, and the method returns true.

**/

public class Solution {
    /**
     * Determines whether string s is a subsequence of string t.
     * 
     * @param s The potential subsequence string.
     * @param t The target string.
     * @return True if s is a subsequence of t, false otherwise.
     */
    public boolean isSubsequence(String s, String t) {
        // If s is empty, it is considered a subsequence of any string
        if (s == null || s.length() == 0) {
            return true;
        }

        // If the length of s is greater than the length of t, s cannot be a subsequence of t
        if (s.length() > t.length()) {
            return false;
        }
        
        // Initialize a pointer i to traverse string s
        int i = 0;

        // Iterate through string s
        while (i < s.length()) {
            // Get the current character from s
            char c = s.charAt(i);
            // Find the index of the current character in t
            int index = t.indexOf(c);
            // If the current character is found in t, update t to exclude the characters before the found index
            // and move to the next character in s
            if (index != -1) {
                t = t.substring(index + 1);
                i++;
            } else {
                // If the current character is not found in t, s is not a subsequence of t
                return false;
            }
        }

        // If all characters in s are found in t in the correct order, s is a subsequence of t
        return true;
    }
}
