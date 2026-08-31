package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiInput {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];
//        System.out.println(arr.length); // it will give me the length of the row


        // Input
        for (int row = 0; row < arr.length; row++) {

            // for each column
            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = in.nextInt();

            }

        }

//        // Output
//        for (int row = 0; row < arr.length; row++) {
//
//            // for each column
//            for (int col = 0; col < arr[row].length; col++) {
//
//                System.out.print(arr[row][col] + " ");
//
//
//            }
//            System.out.println();
//
//        }


        // we can also print like this

//        for (int row = 0; row < arr.length; row++) {
//
//            System.out.println(Arrays.toString(arr[row]));
//
//        }
//
        // or we can also use enhanced for loop for printing the array

        for (int[] a : arr){  // every element is array itself in multidimensional
            System.out.println(Arrays.toString(a));
        }


    }
}
