/*
 * Name: Marco Nino A. Mejurada
 * 
 * Course, Year & Section: BSIT 2A
 */

import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {

        SpoonerismGenerator generator = new SpoonerismGenerator();
        generator.run();

    }


    String getWord(String prompt) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print(prompt);
        return input.nextLine().trim();

    }

    int vowelIndex(String word) {
         
        for (int i = 0; i < word.length(); i++) {

            char c = Character.toLowerCase(word.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                return i;

            }

        }

        return 0;

    }


    public void run() {

        String firstWord = getWord("Enter the first word: ");
        int firstVowelIndex1 = vowelIndex(firstWord);

        
        String secondWord = getWord("Enter the second word: ");        
        int firstVowelIndex2 = vowelIndex(secondWord);

        
        if (firstVowelIndex1 == -1 || firstVowelIndex2 == -1) {

            System.out.println(firstWord + " and " + secondWord + " are not good words to spoonerize.");
            return;
            
        }

        
        String spoonerizedFirst = secondWord.substring(0, firstVowelIndex2) + firstWord.substring(firstVowelIndex1);
        String spoonerizedSecond = firstWord.substring(0, firstVowelIndex1) + secondWord.substring(firstVowelIndex2);

    
        System.out.println(firstWord + " and " + secondWord + " spoonerized are " + spoonerizedFirst + " " + spoonerizedSecond);
    }
}