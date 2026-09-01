package searching;

public class LinearSearch {

    static void main(String[] args) {

        int array[] = {45, 21, 97, 121, 643, -12, -42, 87};
        boolean ans = linearSearch3(array, -112);
        System.out.println(ans);

    }


    // Linear Search and return the index
    //return the index if the item is found
    // otherwise return -1 if not found
    static int linearSearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {

            if (arr[index] == target) {
                return index;
            }
        }

        // if not found return -1
        return -1;

    }


    //Linear search and return the element

    static int linearSearch2(int[] arr, int target){

        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int index = 0; index < arr.length; index++) {

            if (arr[index] == target) {
                return arr[index];
            }
        }

        return Integer.MAX_VALUE;


    }

    static boolean linearSearch3(int[] arr, int target){

        if (arr.length == 0) {
            return false;
        }

        for (int index = 0; index < arr.length; index++) {

            if (arr[index] == target) {
                return true;
            }
        }

        return false;


    }






}
