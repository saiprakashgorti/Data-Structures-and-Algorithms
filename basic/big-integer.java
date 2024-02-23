// https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
         * Main method to execute the program. Reads input from standard input, processes it,
         * and prints output to standard output.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine(); // Reading the number of rows in the matrix

        Map<Integer, int[]> map = new HashMap<>(); // Creating a map to store the matrix rows

        // Loop to read each row of the matrix
        for (int i = 0; i < Integer.parseInt(n); i++) {
            String[] arr = reader.readLine().split(" "); // Reading each row as a string array
            int sizeOfArr = Integer.parseInt(arr[0]); // Extracting the size of the row array
            int[] intarr = new int[sizeOfArr]; // Creating an integer array to store the row elements
            // Loop to parse and store the elements of the row
            for (int j = 0; j < sizeOfArr; j++) {
                intarr[j] = Integer.parseInt(arr[j + 1]);
            }

            map.put(i + 1, intarr); // Storing the row in the map
        }

        String q = reader.readLine(); // Reading the number of queries

        // Loop to process each query
        for (int i = 0; i < Integer.parseInt(q); i++) {
            String[] arr = reader.readLine().split(" "); // Reading each query as a string array
            int x = Integer.parseInt(arr[0]); // Extracting the row number
            int y = Integer.parseInt(arr[1]); // Extracting the column number

            // Checking if the row exists in the matrix
            if (!map.containsKey(x)) {
                System.out.println("ERROR! Row does not exist.");
                continue;
            }

            int[] rowIntArr = map.get(x); // Getting the row array from the map

            // Checking if the column index is within bounds
            if (y <= 0 || y > rowIntArr.length) {
                System.out.println("ERROR! Invalid column index.");
                continue;
            }

            System.out.println(rowIntArr[y - 1]); // Printing the element at the specified position
        }

        reader.close(); // Closing the BufferedReader
    }
}



      
