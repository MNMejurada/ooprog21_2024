import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the string: ");  
        String reverse = ""; 
        String str = sc.nextLine(); 
        int length = str.length();   
        for ( int i = length - 1; i >= 0; i-- )  {
            reverse = reverse + str.charAt(i);  
        }

        if (str.equals(reverse)) { 
            System.out.println("This is a palindrome."); 
        } else  {
         System.out.println("This isn't a palindrome.");
        }
      
    }
}