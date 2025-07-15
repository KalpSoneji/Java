package ImmutableString;

import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wordCount = 0;

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (input.isEmpty()) 
            wordCount = 0; 
        
        else {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') 
                    wordCount++;
            }
            wordCount++;
        }

        System.out.println("Words = " + wordCount);

        sc.close();
    }
}