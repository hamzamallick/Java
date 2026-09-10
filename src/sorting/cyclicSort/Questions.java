package sorting.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class Questions {

    static void main(String[] args) {

    }

    //Q-> Missing number from 0 to n

    static int missingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // search for first missing number

        for (int index = 0; index < arr.length; index++) {

            //case 1

            if (arr[index] != index) {
                return index;
            }

        }


        // case 2 when n is not in the array (example n=4 [1,0,3,2] 4 is missing)
        return arr.length;
    }


    //Q->Find All Numbers Disappeared in an Array

    static List<Integer> allMissingNum(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // search for first missing number

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {

            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }

        }

        return ans;


    }


    //Q->Find the Duplicate Number

    static int duplicate(int[] nums) {

        int i = 0;

        while (i < nums.length) {


            if (nums[i] != i+1){
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    return nums[i];
                }
            }else{
                i++;
            }



        }

        return -1;


    }



    //Q->Set Mismatch
    static int[] mismatch(int[] nums){
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // search for first missing number

        for (int index = 0; index < nums.length; index++) {

            if (nums[index] != index + 1) {
                return new int[] {nums[index],index+1};
            }

        }

        return new int[] {-1,-1};






    }


    //Q-> find the first +ve missing number
    static int positiveMissing(int[] nums){

        int i = 0;

        while (i < nums.length) {

            int correct = nums[i]-1;

            if (nums[i]>0 && nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }


        for (int index = 0; index < nums.length; index++) {


            if (nums[index] != index) {
                return index+1;
            }

        }


        return nums.length+1;
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
