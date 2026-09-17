
import java.util.Scanner;

public class Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        System.out.print("Enter start date (day): ");
        int startDay = input.nextInt();

        System.out.print("Enter end date (day): ");
        int endDay = input.nextInt();

        // Validation 1
        if (startDay < 1 || startDay > 31 ||
            endDay < 1 || endDay > 31) {

            System.out.println("Error: Dates must be between 1 and 31.");
            input.close();
            return;
        }

        // Validation 2
        if (startDay >= endDay) {

            System.out.println("Error: Start date must be less than end date.");
            input.close();
            return;
        }

        int daysReserved = endDay - startDay;

        double totalAmount = daysReserved * ROOM_CHARGE;
        double discountRate = 0;

        if (daysReserved > 3 && daysReserved <= 4) {
            discountRate = DISCOUNT_10;
        } else if (daysReserved >= 5) {
            discountRate = DISCOUNT_20;
        }

        double discountAmount = totalAmount * discountRate;
        double amountToPay = totalAmount - discountAmount;

        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total room charges: Rs. " + totalAmount);
        System.out.println("Discount: " + (discountRate * 100) + "%");
        System.out.println("Discount amount: Rs. " + discountAmount);
        System.out.println("Total amount to pay: Rs. " + amountToPay);

        input.close();
    }
}