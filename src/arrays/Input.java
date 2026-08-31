package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//
//        // array of primitives
//        int[] arr = new int[5];
//
//
//        // taking input by using for loop
//        for (int i = 0; i < arr.length; i++) {
//
//            arr[i] = in.nextInt();
//
//        }
//        // output by using for loop
//        for (int i = 0; i < arr.length; i++) {
//
//            System.out.print(arr[i] + " ");
//
//        }
//
//        // enhanced for loop for printing the elements of array
//        for (int num : arr) {  // here num is representing the element of the array
//
//
//            // basically for every element in the array print the element
//
//            System.out.print(num + " ");
//
//        }
//
//
//        // or we can just use this for the output
//        System.out.println(Arrays.toString(arr));
//
//

        // array of objects
        String [] str = new String[4];

        for (int i = 0; i < str.length; i++) {

            str[i] = in.next();

        }

        System.out.println(Arrays.toString(str));
    }
}
