package ImmutableString;

import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch != ' ' && !inWord) {
                inWord = true;
                wordCount++;
            } 
            
            else if (ch == ' ') 
                inWord = false;
            
        }

        System.out.println("Words = " + wordCount);

        sc.close();
    }
}