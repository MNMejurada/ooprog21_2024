import java.util.Scanner;

public class Lease {
    private String tenantName;
    private int apartmentNumber;
    private double monthlyRent;
    private int termInMonths;

    // Default constructor
    public Lease() {
        this.tenantName = "XXX";
        this.apartmentNumber = 0;
        this.monthlyRent = 1000;
        this.termInMonths = 12;
    }

    // Getters and Setters
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public int getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(int termInMonths) {
        this.termInMonths = termInMonths;
    }

    public void addPetFee() {
        monthlyRent += 10;
    }

    public static void explainPetPolicy() {
        System.out.println("A pet fee of $10 per month will be added to the rent if you have a pet.");
    }

    public void showValues() {
        System.out.println("Tenant Name: " + tenantName);
        System.out.println("Apartment Number: " + apartmentNumber);
        System.out.println("Monthly Rent: $" + monthlyRent);
        System.out.println("Term in Months: " + termInMonths);
    }
}