class Billing {
    public static double computeBill(double price) {
        double total = price * 1.08;         
        System.out.println("Total bill: $" + total);
        return total;
    }

    public static double computeBill(double price, int quantity) {
        double total = price * quantity * 1.08;         
        System.out.println("Total bill: $" + total);
        return total;
    }

    public static double computeBill(double price, int quantity, int discount) {
        double total = (price * quantity * 1.08) - discount;         
        System.out.println("Total bill: $" + total);
        return total;
    } 
    
    public static void main(String[] args) {
        Billing billing = new Billing();
           
        billing.computeBill(23.2);
        billing.computeBill(23.2, 2);
        billing.computeBill(23.2, 2, 3);
   
   
   }

}