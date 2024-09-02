import java.util.*;

public class CarlysEventPrice {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
    
        System.out.println("*************************************\n**Carly's makes the food that makes**\n**          it a party.            **\n*************************************");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of guests attending the event: ");
        int numGuests = in.nextInt();

        
        double pricePerGuest = 35.0;
        double totalPrice = numGuests * pricePerGuest;

        
        System.out.println("Number of guests: " + numGuests);
        System.out.println("Price per guest: $" + pricePerGuest);
        System.out.println("Total price: $" + totalPrice);

        boolean isLargeEvent = numGuests >= 50;
        System.out.println("Is this a large event? " + isLargeEvent);
    }
}
