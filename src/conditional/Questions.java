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


        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " is lower case");
        }else{
            System.out.println(ch + " is upper case");
        }

    }
}
