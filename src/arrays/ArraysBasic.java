package arrays;

public class ArraysBasic {

    static void main(String[] args) {


        int[] rollNum = new int[5]; //syntax of array

        int[] roll; //declaration of an array roll is defined in the stack
        roll = new int[5]; //actual object is created in the heap memory

        // or we can directly do like this
        int [] rnum = {1,2,3,4,5};

        System.out.println(rnum[2]);
        System.out.println(roll[2]); //it will print 0

        String[] arr = new String[5];
        System.out.println(arr[2]);  // it will print null


    }
}
