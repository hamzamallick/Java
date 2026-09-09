package sorting.cyclicSort;

public class Questions {

    static void main(String[] args) {

    }

    //Q-> Missing number from 0 to n

    static int missingNum(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i];
            if (arr[i]< arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        // search for first missing number

        for (int index = 0; index < arr.length; index++) {

            //case 1

            if (arr[index]!=index){
                return index;
            }

        }


        // case 2 when n is not in the array (example n=4 [1,0,3,2] 4 is missing)
        return arr.length;
    }





    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
