import java.util.*;

class SortThreeNums {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Please enter the second number: ");
        int num2 = input.nextInt();
        
        System.out.print("Please enter the third number: ");
        int num3 = input.nextInt();

        
        if (num1 <= num2 && num2 <= num3) {
            
            System.out.println("Numbers in ascending order: " + num1 + " " + num2 + " " + num3);
        } else {
           
            int max, mid, min;

            
            if (num1 >= num2 && num1 >= num3) {
                max = num1;
                if (num2 >= num3) {
                    mid = num2;
                    min = num3;
                } else {
                    mid = num3;
                    min = num2;
                }
            } else if (num2 >= num1 && num2 >= num3) {
                max = num2;
                if (num1 >= num3) {
                    mid = num1;
                    min = num3;
                } else {
                    mid = num3;
                    min = num1;
                }
            } else {
                max = num3;
                if (num1 >= num2) {
                    mid = num1;
                    min = num2;
                } else {
                    mid = num2;
                    min = num1;
                }
            }
            System.out.println("Numbers order: " + min + " " + mid + " " + max);
        }
    } 
}