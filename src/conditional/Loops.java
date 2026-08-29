package conditional;

import java.util.Scanner;

public class Loops {
    static void main(String[] args) {


        // print number till user want by using for loop

        Scanner in = new Scanner(System.in);


//        for (int num = 1; num <= n; num++) {
//            System.out.println(num);
//        }


        // same thing by using while loop


        int n = in.nextInt();
        int num = 1;


//        while (num <= n) {
//            System.out.println(num);
//            num++;
//        }

        // do while loop
        do {
            System.out.println(num);
            num++;

        } while (num <= n);


    }
}
