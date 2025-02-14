import java.util.Scanner;

public class TestLease {
    public static void main(String[] args) {
        Lease lease1;
        Lease lease2;
        Lease lease3;
        Lease lease4;

        lease1 = getData();
        lease2 = getData();
        lease3 = getData();
        lease4 = new Lease();

        System.out.println("\nLease 1 Details:");
        lease1.showValues();

        lease1.addPetFee();

        Lease.explainPetPolicy();

        System.out.println("\nUpdated Lease 1 Details after adding pet fee:");
        lease1.showValues();

        System.out.println("\nLease 2 Details:");
        lease2.showValues();

    
        System.out.println("\nLease 3 Details:");
        lease3.showValues();
    }

    public static Lease getData() {
        Scanner scanner = new Scanner(System.in);
        Lease lease = new Lease();

        System.out.print("Enter tenant name: ");
        lease.setTenantName(scanner.nextLine());

        System.out.print("Enter apartment number: ");
        lease.setApartmentNumber(scanner.nextInt());

        System.out.print("Enter monthly rent: ");
        lease.setMonthlyRent(scanner.nextDouble());

        System.out.print("Enter term in months: ");
        lease.setTermInMonths(scanner.nextInt());
        scanner.nextLine(); 

        System.out.println(); 
                return lease;

        
    }
}