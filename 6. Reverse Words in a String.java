/**

151. Reverse Words in a String
https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75

**/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * Reverses the order of words in a string.
     * 
     * @param s The input string.
     * @return The string with its words in reverse order.
     */
    public String reverseWords(String s) {
        // Get the length of the input string
        int len = s.length();
        // Create a list to store individual words
        List<String> list = new ArrayList<>();
        // Initialize a pointer to traverse the string
        int l = 0;
        
        // Iterate through the string until the pointer reaches the end
        while (l < len) {
            // Initialize an empty string to store the current word
            String word = "";
            // Extract the current word by traversing characters until a space is encountered
            while (l < len && s.charAt(l) != ' ') {
                word += s.charAt(l);
                l++;
            } 

            // Move the pointer past any consecutive spaces
            while (l < len && s.charAt(l) == ' ') {
                l++;
            } 

            // If the current word is not empty, add it to the list of words
            if (!"".equals(word)) {
                list.add(word);
            }
        }

        // Initialize an empty string to store the result
        s = "";
        // Iterate through the list of words in reverse order and append them to the result string
        for (int i = list.size() - 1; i >= 0; i--) {
            s += list.get(i) + " ";
        }

        // Trim any trailing spaces and return the result
        return s.trim();
    }
}
