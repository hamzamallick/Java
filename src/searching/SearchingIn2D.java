package searching;

import java.util.Arrays;

public class SearchingIn2D {
    static void main(String[] args) {

        int[][] array =
                {
                        {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {28, 29, 37, 49},
                        {30, 33, 49, 50}
                };

        System.out.println(Arrays.toString(findIn2d(array, 37)));


    }

    //Q-> Find the target element in the given 2d array row and column wise sorted

    static int[] findIn2d(int[][] arr, int target) {

        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[]{r, c};
            }
            if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }


        }
        return new int[]{-1, -1};


    }

}
