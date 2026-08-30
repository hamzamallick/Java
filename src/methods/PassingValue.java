package methods;

public class PassingValue {



    //Primitive values → method gets a copy → changing the copy doesn't change the original.

    static void main(String[] args) {

//        String name = "Abbad";
//        changeName(name);
//        System.out.println(name);

        int first = 10;
        int second = 20;
        swap(first,second); // here it will be swapped as we print from function


        // but here the original will not get swap bcz only the copy of the original one is passed from here
        System.out.println("First: "+first+" Second: "+second);




    }



    static void changeName(String Naam){

        Naam = "Hamza";
//        System.out.println(Naam);

    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("First: "+num1+" Second: "+num2);
    }
}
