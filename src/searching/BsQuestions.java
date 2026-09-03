package searching;

public class BsQuestions {

    static void main(String[] args) {

//        char[] let = {'c', 'c', 'c', 'c', 'c', 'f'};
//
//        System.out.println(nextGreatestLetter(let, 'z'));
//
//        int[] array = {-22, -10, -9, -5, -1, 0};
////        System.out.println(maximumCount(array));
//
//        int[] celaray = {2, 3, 5, 9, 14, 16, 18, 20};
////        System.out.println(ceiling(celaray,4));
////        System.out.println(floor(celaray,4));


        int[] array = {3, 5, 20, 25, 30, 33, 49, 51, 67, 69, 60, 34,25, 10, 9, 7, 6, 1};

//        System.out.println(peak(array));
        System.out.println(findMount(array, 10));


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


    //Q- position of an element in infinite array
    static int ans(int[] arr, int target) {

        //first find the range
        // start with the box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in a range
        while (target > arr[end]) {
            int newStart = end + 1;
            // end = previous end + size of the box *2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return infinite(arr, target, start, end);
    }

    static int infinite(int[] arr, int target, int start, int end) {

        if (arr.length == 0) {
            return -1;
        }


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }
        }
        return -1;
    }


    static int peak(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // this means you are in the decreasing part of the array
                //this may be the ans but look on the left side
                //this is why end != mid-1
                end = mid;
            } else {
                // you are in the ascending part of the array
                start = mid + 1;
                // bcz we know that next element is greater than the mid element that is why start = mid+1
            }
        }

        // in the end start == end and will point to the largest element
        // start and end are trying to find the largest element in the above two checks
        // hence above t

        return start;
    }


    //Q-1095 -> find the element in the mountain array

    static int findMount(int[] arr, int target) {

        int peak = peak(arr);
        int leftSearch = binarySearch2(arr,target,0,peak );
//        int rightSearch = binarySearch2(arr,target,peak, arr.length);

        if (leftSearch!=-1){
            return leftSearch;
        }else return binarySearch2(arr,target,peak+1, arr.length);


    }


    static int binarySearch2(int arr[], int target,int start, int end) {

        if (arr.length == 0) {
            return -1;
        }



        if (arr[start] < arr[end]) {

            while (start <= end) {
                //find the middle element

//            int mid = (start+end)/2; //but this may exceed the int value we will little bit modify this formula

                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;

                } else {
                    return mid;
                }
            }
        } else {

            while (start <= end) {
                //find the middle element

//            int mid = (start+end)/2; //but this may exceed the int value we will little bit modify this formula

                int mid = start + (end - start) / 2;

                if (arr[mid]>target){
                    start = mid +1;
                } else if (arr[mid]<target) {
                    end = mid-1;

                }else {
                    return mid;
                }
            }
        }


        return -1;

    }


}
