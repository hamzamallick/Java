package conditional;

import java.util.Scanner;

public class NestedSwitch {


    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Employee ID");

        int empId = in.nextInt();

        System.out.println("Enter Department ID");
        int Dep = in.nextInt();

        switch (empId) {
            case 1 -> {
                System.out.println("Hamza");
                switch (Dep) {
                    case 1 -> System.out.println("IT Department");
                    case 2 -> System.out.println("Management Department");
                    case 3 -> System.out.println("Sales Department");
                    default -> System.out.println("New Member");
                }
            }
            case 2 -> {
                System.out.println("Umar");
                switch (Dep) {
                    case 1 -> System.out.println("IT Department");
                    case 2 -> System.out.println("Management Department");
                    case 3 -> System.out.println("Sales Department");
                    default -> System.out.println("New Member");
                }
            }

            case 3 -> {
                System.out.println("Abbad");
                switch (Dep) {
                    case 1 -> System.out.println("IT Department");
                    case 2 -> System.out.println("Management Department");
                    case 3 -> System.out.println("Sales Department");
                    default -> System.out.println("New Member");
                }
            }

            case 4 -> {
                System.out.println("Mushir");
                switch (Dep) {
                    case 1 -> System.out.println("IT Department");
                    case 2 -> System.out.println("Management Department");
                    case 3 -> System.out.println("Sales Department");
                    default -> System.out.println("New Member");
                }
            }
            default -> System.out.println("Not in this company");


        }

    }


}
