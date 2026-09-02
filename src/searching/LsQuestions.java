package searching;

import java.util.Arrays;

public class LsQuestions {

    static void main(String[] args) {

//        String name = "Hamza";
//        boolean ans = searchString(name, 'a');
//        System.out.println(ans);
//

        int array[] = {-42, 14, 63, 642, 78, -327, 267, 2178, 2, 9, 0, 12};

        int array2d[][] =
                {
                        {2, 4, 1, 5},
                        {7, 6, 2},
                        {0, 3, 1, 1},
                        {3, 8}
                };


//        System.out.println(searchInRange(array,2,11,0));


//        System.out.println(searchMinimum(array));

//
//        int[] ans = searchIn2D(array2d,62);
//        System.out.println(Arrays.toString(ans));


//        System.out.println(searchMaxIn2D(array2d));


//        System.out.println(evenDigit(array));


        System.out.println(richest(array2d));
    }


    //Q-Search in a String

    static boolean searchString(String str, char target) {

        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target) {
                return true;
            }

        }

        return false;
    }


    //Q- Search in a range
    static int searchInRange(int[] arr, int start, int end, int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (start = 0; start <= end; start++) {

            if (arr[start] == target) {
                return start;
            }

        }
        return -1;

    }

    //Q- Search minimum number in the array

    static int searchMinimum(int[] arr) {


        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

        }


        return min;
    }


    //Q- Search in 2D array

    static int[] searchIn2D(int arr[][], int target) {

        if (arr.length == 0) {
            return new int[]{-1, -1};
        }

        for (int row = 0; row < arr.length; row++) {

            // for each column
            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }

            }
        }

        return new int[]{-1, -1};

    }


    //Q- max/min in 2d array

    static int searchMaxIn2D(int arr[][]) {

        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        int max = arr[0][0];

        for (int row = 0; row < arr.length; row++) {

            // for each column
            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] > max) {
                    max = arr[row][col];
                }

            }
        }

        return max;

    } // similarly we can do for the min value of the 2d array


    //Q- in a given array count how many elements contain even digit eg arr ={12,345,143,5625} -> 2 elements contains even digits
    static int evenDigit(int[] arr) {

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {


            int count = 0;
            int num = arr[i];

            if (num < 0) {
                num = num * -1;
            }

            if (num == 0) {
                count = 1;
            }
            while (num > 0) {
                count++;
                num = num / 10;
            }

            if (count % 2 == 0) {
                ans++;
            }

        }
        return ans;

    }


    //Q- In a given 2d array which row has the highest sum of the elements

    static int richest(int[][] accounts) {

        int ans = 0;

        for (int personn = 0; personn < accounts.length; personn++) {

            int sum = 0;

            for (int account = 0; account < accounts[personn].length; account++) {
                sum += accounts[personn][account];

            }

            // now we have to compare it with the previous rowsum
            if (sum > ans) {
                ans = sum;
            }
        }


        return ans;


    }
}
