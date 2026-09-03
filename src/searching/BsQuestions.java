package searching;

public class BsQuestions {

    static void main(String[] args) {

        char[] let = {'c', 'c', 'c', 'c', 'c', 'f'};

        System.out.println(nextGreatestLetter(let, 'z'));

        int[] array = {-22, -10, -9, -5, -1, 0};
//        System.out.println(maximumCount(array));

        int[] celaray = {2, 3, 5, 9, 14, 16, 18, 20};
//        System.out.println(ceiling(celaray,4));
//        System.out.println(floor(celaray,4));
    }


    // Q- next gratest letter

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }


        return letters[start % letters.length];


    }

    static int maximumCount(int[] nums) {

        int start = 0;
        int negativeCount = 0;
        int positiveCount = 0;

        if (nums[start] > 0) {
            return nums.length;
        }
        if (nums[nums.length - 1] < 0) {
            return nums.length;
        }

        for (start = 0; start < nums.length; start++) {

            if (nums[start] < 0) {
                negativeCount++;

            } else if (nums[start] > 0) {
                positiveCount++;

            }

        }
        return Math.max(positiveCount, negativeCount);

    }


    //Q- count the negative number in 2d array

    static int countNegatives(int[][] grid) {

        int neg = 0;


        for (int row = 0; row < grid.length; row++) {

            for (int col = 0; col < grid[row].length; col++) {

                if (grid[row][col] < 0) {
                    neg++;
                }

            }

        }
        return neg;

    }


    // Q- Ceiling of a number
    static int ceiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];

            }

        }

        if (start < arr.length) {
            return arr[start];
        } else return Integer.MAX_VALUE;

    }


    static int floor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];

            }

        }

        if (end < 0) {
            return Integer.MIN_VALUE;
        } else return arr[end];

    }


}
