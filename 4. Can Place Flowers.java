/**
605. Can Place Flowers
https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
**/

public class Solution {
    /**
     * Determines whether it's possible to place flowers in the flowerbed such that
     * no two adjacent flowers are planted and returns true if it's possible, false otherwise.
     * 
     * @param flowerbed An array representing the flowerbed where 0 indicates empty spots
     *                  and 1 indicates planted flowers.
     * @param n         The number of flowers to be planted.
     * @return          True if it's possible to plant n flowers in the flowerbed, false otherwise.
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        
        // If no flowers need to be planted, return true
        if (n == 0) {
            return true;
        }
        
        // If the flowerbed has only one spot and one flower needs to be planted, 
        // return true if the spot is empty (0), false otherwise
        if (length == 1 && n == 1) {
            return flowerbed[0] == 0;
        }

        // Initialize pointers to track the previous, current, and next spots in the flowerbed
        int prev = 0;
        int current = 1;
        int next = 2;

        // Check if the first two spots in the flowerbed are empty,
        // if so, plant a flower in the first spot and decrement the count of flowers to be planted (n)
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[prev] = 1;
            n--;
        }

        // Check if the last two spots in the flowerbed are empty,
        // if so, plant a flower in the last spot and decrement the count of flowers to be planted (n)
        if (flowerbed[length - 2] == 0 && flowerbed[length - 1] == 0) {
            flowerbed[length - 1] = 1;
            n--;
        }

        // Iterate through the flowerbed to find spots where flowers can be planted
        while (current < length && next < length) {
            // If the current spot and the adjacent spots are empty,
            // plant a flower in the current spot and decrement the count of flowers to be planted (n)
            if (flowerbed[current] == 0 && flowerbed[next] == 0 && flowerbed[prev] == 0) {
                flowerbed[current] = 1;
                n--;
                prev++;
                current++;
                next++;
            }
            // Move the pointers to the next spots
            prev++;
            current++;
            next++;

            // If all flowers have been planted (n == 0), return true
            if (n == 0) {
                return true;
            }
        }

        // Return true if all flowers have been planted or false otherwise
        return n <= 0;
    }
}
