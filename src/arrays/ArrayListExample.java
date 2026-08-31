package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Syntax
        ArrayList<Integer> name = new ArrayList<>(5);

//        name.add(1);
//        name.add(2);
//        name.add(3);
//        name.add(4);
//        name.add(5);
//        name.add(6);
//        name.add(7);
//
//        System.out.println(name);
//
//        name.set(3,0);
//        name.remove(6);
//        System.out.println(name);

        for (int i = 0; i < 5; i++) {

            name.add(in.nextInt());

        }

        for (int i = 0; i < 5; i++) {

            System.out.println(name.get(i));
            
        }


    }

}
