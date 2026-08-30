package methods;

public class Shadowing {

    static int x = 10; // this will be shadowed in the line 9

    static void main(String[] args) {

        System.out.println(x);

        int x = 40;  // class variable x is shadowed here

        System.out.println(x);

        fun();

    }


    static void fun() {

        System.out.println(x);
    }
}
