package sorting.cyclicSort;

import java.util.Arrays;

public class Cyclic {

    // when given numbers from range 1 to n

    static void main(String[] args) {
        int[] Array = {5,4,3,2,1};
        cyclic(Array);
        System.out.println(Arrays.toString(Array));
    }


    static void cyclic(int[] arr){

        int i = 0;
        while (i<arr.length){
            int correctIndex = arr[i] -1;
            if (arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
