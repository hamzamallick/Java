package methods;

import java.util.Arrays;

public class Overloading {

    // Function overloading


    // Two function of the same name can exist if the parameter of the functions are different
    // parameter difference can be of two type like
    // number of parameter diff or type of parameter difference


    static void main(String[] args) {


        // compile time it decides which function should be called

        fun();   // like it have no arguments so the fun with no arguments will be called

        fun(7);

        fun("Hamza", 7);   // like it have a string and a int as an argument so the fun that argument will be called

        fun(2, 3);

        fun("Hamza", "Umar");




        demo(1,2,3,4,5);
        demo("fs","ref","shfkjsh","hdsjkfh");


        // one important thing like if we apply variable argument in this and we do not pass any argu here it will show error
        // as it can not decide which one should be called

//        demo();





    }


    static void fun() {

        System.out.println("Empty");

    }

    static void fun(int a) {
        System.out.println(a);

    }

    static void fun(int a, int b) {

        System.out.println(a);
        System.out.println(b);

    }

    static void fun(String a, int b) {
        System.out.println(a);
        System.out.println(b);

    }

    static void fun(String a, String b) {
        System.out.println(a);
        System.out.println(b);

    }

    static void demo(int ...v){

        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){

        System.out.println(Arrays.toString(v));
    }


}
