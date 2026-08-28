package basics;

import java.util.Scanner;

public class Sum {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input 2 numbers for sum");

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Sum is " + (a + b));

    }
}
