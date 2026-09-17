
import java.util.Scanner;

public class Lab5Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of new members: ");
        int members = input.nextInt();

        if (members < 0) {
            System.out.println("Invalid number of members");
        } else {

            switch (members) {

                case 0:
                    System.out.println("Prize: No Prize");
                    break;

                case 1:
                    System.out.println("Prize: Pen");
                    break;

                case 2:
                    System.out.println("Prize: Umbrella");
                    break;

                case 3:
                    System.out.println("Prize: Bag");
                    break;

                case 4:
                    System.out.println("Prize: Travelling Chair");
                    break;

                default:
                    System.out.println("Prize: Headphone");
            }
        }

        input.close();
    }
}