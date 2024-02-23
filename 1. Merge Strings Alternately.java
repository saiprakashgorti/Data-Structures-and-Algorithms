/**

1768. Merge Strings Alternately
https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75

Important details:
1. Usage of a StringBuilder instead of String when you're appending to the String significantly reduces the compute time and reduces the memory consumption too
2. Spliting the string into charArray was more efficient than using charAt method of String class

**/

// 1ms beats 85.41%
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int sizeOfWord1 = word1.length();
        int sizeOfWord2 = word2.length();

        int indexForWord1 = 0;
        int indexForWord2 = 0;

        StringBuilder finalString = new StringBuilder();

        while(indexForWord1 < sizeOfWord1 || indexForWord2 < sizeOfWord2) {
            if(indexForWord1 < sizeOfWord1)
                finalString.append(word1.charAt(indexForWord1++));
            if(indexForWord2 < sizeOfWord2)
                finalString.append(word2.charAt(indexForWord2++));
        }

        return finalString.toString();
    }
}

// 0ms beats 100%
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int sizeOfWord1 = word1.length();
        int sizeOfWord2 = word2.length();
        int indexForWord1 = 0;
        int indexForWord2 = 0;
        int min = Math.min(sizeOfWord1, sizeOfWord2);
        StringBuilder finalString = new StringBuilder();

        for(int i=0; i<min; i++) {
            finalString.append(word1.charAt(indexForWord1++));
            finalString.append(word2.charAt(indexForWord2++));
        }
        
        if(indexForWord1 < sizeOfWord1) {
            finalString.append(word1.substring(indexForWord1));
        }

        if(indexForWord2 < sizeOfWord2) {
            finalString.append(word2.substring(indexForWord2));
        }

        return finalString.toString();
    }
}
