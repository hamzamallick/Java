package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Questions {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] array = {145, 54, 13, 75, 27, 99, 0};


//        System.out.println(Arrays.toString(array));
//        swap(array,2,3);
//        System.out.println(Arrays.toString(array));
//
//
//        max(array);
//
//        int ans = maximum(array);
//        System.out.println(ans);

//        maxRange(array, 3, array.length - 1);

//        reverse(array);
        rev(array);
        System.out.println(Arrays.toString(array));

    }


    // Q- Swap the any two element of the array
    static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

    // Q- Find the max of element of the array (self done)
    static void max(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }

    // Done by the video
    static int maximum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    //Q- for finding the max element in a given range
    static void maxRange(int[] arr, int start, int end) {
        int max = arr[start];

        for (int i = start; i <= end; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }


    // Q- Reverse the element of the array

    static void reverse(int[] arr) {


        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }


    }

    static void rev(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start<end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }


}
