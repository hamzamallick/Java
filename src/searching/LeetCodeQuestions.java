package searching;


public class LeetCodeQuestions {

    public static void main(String[] args) {

        int[] array = {2, 5, 6, 0, 0, 1, 2};
//        System.out.println(findPivot(array));

        System.out.println(findElementdDup(array, 2));

//        System.out.println(findPivotDup(array));
    }


    //Q34-> first and last position of the element
    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int[] ans = {-1, -1};

        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;


    }

    // this function will just return the index value of the target

    int search(int[] nums, int target, boolean findStartIndes) {

        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;

            } else {

                ans = mid;
                if (findStartIndes) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }

        return ans;

    }

    // Q-33-> search in rotated sorted array
    static int findPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // this function will find the target element here

    static int findElement(int[] nums, int target) {

        int piviot = findPivot(nums);

        if (piviot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // we have 3 cases

        if (nums[piviot] == target) {
            return piviot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, piviot - 1);
        }

        return binarySearch(nums, target, piviot + 1, nums.length - 1);


    }

    static int binarySearch(int nums[], int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }
        }
        return -1;

    }


    //Q-> if the duplicate case of piviot

    static int findPivotDup(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }


            // if the element at start, mid and end are same
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                //we have to skip the duplicates
                // what is the either start or end is the pivot element? so we have to check it first

                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (start <= end && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    static int findElementdDup(int[] nums, int target) {

        if (nums.length == 0) {
            return -1;
        }

        int piviot = findPivotDup(nums);

        if (piviot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // we have 3 cases

        if (nums[piviot] == target) {
            return piviot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, piviot - 1);
        }

        return binarySearch(nums, target, piviot + 1, nums.length - 1);


    }


}


