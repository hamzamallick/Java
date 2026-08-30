package methods;

import java.util.Scanner;

public class Questions {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();


//        prime(n);
//
//        boolean ans = isPrime(n);
//        System.out.println(ans);

//        System.out.println(isArmstrong(n)); //this will check if the given number is armstrong or not

        // by applying this for loop we can get all the 3 digit armstrong numbers

        for (int i = 100; i < 1000; i++) {

            if (isArmstrong(i)) {
                System.out.println(i);
            }

        }


    }

    // Q- Prime Number (by using for loop)
    static void prime(int number) {

        if (number < 2) {
            System.out.println("Not prime");
            return;
        }

        for (int c = 2; c < number; c++) {

            if (number % c == 0) {
                System.out.println("Not prime");
                return;
            }
        }

        System.out.println("prime");
    }


    // Q- Prime number by using while loop

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        int c = 2;
        while (num > c) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }


    // Q- Armstrong number (print all 3 digit armstrong number)


    // An Armstrong number is a number where the sum of each digit raised to the
    // power of the number of digits equals the original number.
    static boolean isArmstrong(int a) {

        int original = a;
        int sum = 0;

        while (a > 0) {

            int rem = a % 10;
            a = a / 10;
            sum = sum + rem * rem * rem;


        }

        return sum == original;

    }

}
