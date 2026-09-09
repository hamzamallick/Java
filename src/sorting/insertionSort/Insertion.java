package sorting.insertionSort;

import java.util.Arrays;

public class Insertion {

    // for every index put that element in the correct position on the left hand side


    static void main(String[] args) {

        int[] array = {-2,0,-1,67,-98};
        insertion(array);
        System.out.println(Arrays.toString(array));

    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {

                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }

            }
        }
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
