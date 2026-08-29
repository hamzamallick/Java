package conditional;

import java.util.Scanner;

public class IfElse {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your salary?");
        int salary = input.nextInt();


//        if (salary >= 20000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }

        // we can also add multiple if else conditon

        if (salary <= 10000) {
            salary += 1000;
        } else if (salary <= 20000) {
            salary += 2000;

        } else {
            salary += 5000;
        }
        System.out.println("Your new salary is " + salary);
    }
}
