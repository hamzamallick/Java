package methods;

import java.util.Scanner;

public class Functions {

    // block of code which perform a particular task and can be called again and again
    // Functions are called Methods in JAVA because any function inside a class is called as method


    static void main(String[] args) {

//        sum();  // calling of the function


//        int ans = sum2();    // sum2 will return an integer and it will be stored in this ans variable
//        System.out.println(ans);


//        String message = greeting2();
//        System.out.println(message);
//
//


        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");
        int num2 = in.nextInt();

        int ans = sum3(num1, num2);

        System.out.println(ans);


    }


    // void means it will not return anything
    static void sum1() {  //function creation

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");

        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum is: " + sum);

    }

    static void greeting1() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = in.nextLine();
        System.out.println("Hello " + name);
    }

    // here sum2 is of return type int so it will return the int

    static int sum2() {  //function creation

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");

        int num2 = in.nextInt();

        int sum = num1 + num2;

        return sum;  // will return int

    }

    static String greeting2() {

        String greet = "How are you";

        return greet;

    }

    static int sum3(int a, int b) {  // in the bracket section there is arguments
        int sum = a + b;
        return sum;
    }
}
