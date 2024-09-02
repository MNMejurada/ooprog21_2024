import java.util.*;

public class SammysRentalPrice {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\nS Sammy's makes it fun in the sun. S\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the amount or number of minutes you rented the equipment: ");
        int minutesRented = in.nextInt();

        int hours = minutesRented / 60;
        int remainingMinutes = minutesRented % 60;

        double hourlyRate = 40.0;
        double additionalMinuteRate = 1.0;
        double totalPrice = hourlyRate * hours + additionalMinuteRate * remainingMinutes;


        System.out.printf("Hours: " + hours);
        System.out.println("Minutes: " + remainingMinutes);
        System.out.println("Total price: $" + totalPrice);






    }
    
}
