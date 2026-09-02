package searching;

public class BinarySearch {

    // In binary search we divide the array into two half and compare the middle element to the target one if the target and middle are equal
    // then we found the element otherwise we look for the if the middle is smaller than the target we move to the right
    // or else if the middle is greater than the target then we search the element in the left


    // NOTE:- this algo will work on the sorted array

    static void main(String[] args) {

        int arrayAsc[] = {-45, -32, -10, -5, 0, 4, 9, 11, 16, 19, 24, 39, 41, 66, 73, 77, 79, 89, 90, 94, 100};

//        System.out.println(binarySearch(arrayAsc, 100));

        int arrrayDsc[] ={100,94,77,66,60,58,54,51,50,49,44,33,27,22,17,13,10,9,5,1,0,-1,-2,-32,-45};


//        System.out.println(binarySearch2(arrayAsc,100));
//        System.out.println(binarySearch2(arrayAsc,100));


//        System.out.println(insert(arrayAsc,96));


        int misarr[] = {9,6,4,2,3,5,7,0,1,10,8};



        System.out.println(missingNumber(misarr));

    }

    static int binarySearch(int arr[], int target) {

        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

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
        return -1;

    }

    static int bS(int arr[], int target) {

        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

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
        return -1;

    }





    // Order agnostic binary search - if we do not know the array is in ascending order or in descending order

    static int binarySearch2(int arr[], int target) {

        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;


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


    //Q- search for the element and if not found return the index where it will be suitable place

    static int insert(int[] arr, int target){

        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

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

        return start;


    }


    static int missingNumber(int[] nums) {


        int l = nums.length;
        int n = l*(l+1)/2;

        for (int i = 0; i < nums.length; i++) {
            n = n-nums[i];

        }


        return n;

    }

}
