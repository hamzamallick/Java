package sorting.selectionSort;

import java.util.Arrays;

public class Selection {

    static void main(String[] args) {

        int[] array = {4,2,8,1,0,5};
        Selection(array);

    }

    static void Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max element in the remaining array and swap it with the correct index
            int lastIndex = arr.length - i - 1;
            // getting the index of the max element
            int maxIndex = getMaxIndex(arr, 0, lastIndex);

            // swapping the max element with the last index
            swap(arr, maxIndex, lastIndex);
        }
        System.out.println(Arrays.toString(arr));
    }


// Function for getting the index of the max element
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {

            if (arr[max] < arr[i]) {
                max = i;

            }

        }
        return max;
    }

    //function for swapping the value

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
