package sorting.bubbleSort;

import java.util.Arrays;

public class Bubble {
    static void main(String[] args) {

        int[] array = {5,1,8,2,5,0};
        bubble(array);
        System.out.println(Arrays.toString(array));

    }


    static void bubble(int[] arr) {

        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step max item will come to the last index
            for (int j = 1; j < arr.length - i; j++) {
                // now swap the array here
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }

            if (!swapped){
                break;
            }
        }
    }
}
