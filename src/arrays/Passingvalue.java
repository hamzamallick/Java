package arrays;

import java.util.Arrays;

public class Passingvalue {

    static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums));

        // both are pointed to the same object that's why is we change the value of any element from the function it will also
        // change the original one

        // arrays are mutable in java
        change(nums);
        System.out.println(Arrays.toString(nums));


    }

    static void change(int[] arr) {

        arr[3] = 13;
    }
}
