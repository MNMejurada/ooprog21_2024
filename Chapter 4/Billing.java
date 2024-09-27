class Billing {
    public double computeBill(double price) {
        double total = price * 1.08;         
        System.out.println("Total bill: $" + total);
        return total;
    }

    public double computeBill(double price, int quantity) {
        double total = (price * quantity) + (price * 1.08);         
        System.out.println("Total bill: $" + total);
        return total;
    }

    public double computeBill(double price, int quantity, int couponDiscount) {
        double total = (price * quantity) + (price * quantity * couponDiscount / 100) * 1.08;         
        System.out.println("Total bill: $" + total);
        return total;
    } 
    
    public static void main(String[] args) {
        Billing billing = new Billing();
           
        billing.computeBill(23.2);
        billing.computeBill(23, 3);
        billing.computeBill(23.2, 2, 3);  
   }

}