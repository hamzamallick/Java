package methods;

import java.util.Arrays;

public class VariableArguments {

    // Variable length arguments


    static void main(String[] args) {

        fun(1,2,3,4,5,6,7);

        multiple(1,2,3,"sjdlfs","lkjfls");

    }


    // this will take the array of int in the parameter or it can be string char

    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }

    static void multiple(int a, int b, int c, String ...s){

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Arrays.toString(s));

    }
}
