package conditional;

import java.util.Scanner;

public class Questions {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        // Q-Maximum of 3 given numbers


//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//        int max = a;
//
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//
//        System.out.println("Maximum among the these (" + a + " " + b + " " + c + ") is " + max);


        // Q-Check the alphabet is upper case or lower case

//
//        char ch = in.next().trim().charAt(0);
//
//        if (ch >= 'a' && ch <= 'z'){
//            System.out.println(ch + " is lower case");
//        }else{
//            System.out.println(ch + " is upper case");
//        }
//
//
//

        // Q- Fibonacci Number

//        int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//
//        while (count <= n) {
//
//            int temp = b;
//            b = a + b;
//            a = temp;
//            count++;
//
//
//        }
//        System.out.println(b);


        // Q-counting Occurrence


//        System.out.println("Enter number you want to check");
//        int num = in.nextInt();
//        System.out.println("What digit you want to check");
//        int digit = in.nextInt();
//        int count = 0;
//        while (num > 0) {
//            int rem = num % 10;
//            if (rem == digit) {
//                count++;
//                num = num / 10;
//            } else {
//                num = num / 10;
//
//            }
//        }
//        System.out.println(count);


        // Q- Reverse the number

        System.out.println("Enter the number you want to reverse:");

        int num = in.nextInt();
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            ans = ans * 10 + rem;
        }
        System.out.println("Reverse is: " + ans);

    }
}
