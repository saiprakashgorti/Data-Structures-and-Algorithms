/** 

1071. Greatest Common Divisor of Strings

public String gcdOfStrings(String str1, String str2):
* This method takes two strings, str1 and str2, as input parameters.
* It concatenates str1 and str2 together in two different orders: str1 + str2 and str2 + str1.
* If these concatenations result in the same string, it means that both strings share a common divisor. If not, there's no common divisor, and the method returns an empty string.
* If a common divisor is found, the method computes the length of the greatest common divisor (gcd) of the lengths of str1 and str2 using the gcd method.
* Finally, it returns a substring of str1 with a length equal to the computed gcd.

private int gcd(int a, int b):
* This method calculates the greatest common divisor (gcd) of two integers a and b using Euclid's algorithm, a recursive approach.
* The algorithm works as follows:
* If b is 0, then a is the gcd of a and b.
* Otherwise, the method calls itself recursively with arguments b and a % b (the remainder of dividing a by b).
* The process continues until b becomes 0, at which point the gcd is found and returned.

**/

public class Solution {
    
    /**
     * Finds the greatest common divisor (gcd) of two strings.
     * 
     * @param str1 The first string.
     * @param str2 The second string.
     * @return The gcd of the two strings, or an empty string if they have no common divisor.
     */
    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenating str1 and str2 in both orders results in the same string
        if (!(str1 + str2).equals(str2 + str1)) {
            // If not, there is no common divisor, return an empty string
            return "";
        }
        
        // Compute the gcd of the lengths of str1 and str2
        int gcd = gcd(str1.length(), str2.length());
        
        // Return a substring of str1 with length equal to the computed gcd
        return str1.substring(0, gcd);
    }

    /**
     * Computes the greatest common divisor (gcd) of two integers using Euclid's algorithm.
     * 
     * @param a The first integer.
     * @param b The second integer.
     * @return The gcd of the two integers.
     */
    private int gcd(int a, int b) {
        // Base case: If b is 0, return a
        return b == 0 ? a : gcd(b, a % b);
    }
}
