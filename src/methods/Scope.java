package methods;

public class Scope {
    static void main(String[] args) {

        int a = 10;
        System.out.println(a);
        random();
//        System.out.println(num); // this will show error because num is in the function scope and we can not access that here


        //Block scope
        {

            // values initialize in this block will remain in this block only

//            int a = 8;  // we can not initialize the same variable again bcz it is initialize in the same method above
            a = 10;  // but we can access it here
            System.out.println(a);

            int b = 45;

        }

        int b = 29; // can be initialize again outside the block but we can not access it

//        System.out.println(b); // the variable that is initialize in the block scope can not be access out of the block

    }

    static void random(){

        int num = 10;
        System.out.println(num);

//        System.out.println(a); // a is not the in this function that's why it can not be access
    }
}
