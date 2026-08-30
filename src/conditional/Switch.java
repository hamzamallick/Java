package conditional;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        String fruit = in.next();

        int day = in.nextInt();

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("Sweet in taste");
//            case "Banana" -> System.out.println("Lamba");
//            case "Orange" -> System.out.println("Gol");
//            default -> System.out.println("Enter fruits only");
//        }


//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Enter till 7 only");
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Enter till 7 only");
        }

    }
}
