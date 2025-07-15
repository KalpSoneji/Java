package ImmutableString;

import java.util.Scanner;

public class letterCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        int[] freq = new int[52];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                freq[ch - 'A']++; 
            } else if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a' + 26]++;
            }
        }

        System.out.println("\nCharacter Frequencies:");

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) ('A' + i) + " = " + freq[i]);
            }
        }

        for (int i = 26; i < 52; i++) {
            if (freq[i] > 0) {
                System.out.println((char) ('a' + (i - 26)) + " = " + freq[i]);
            }
        }

        sc.close();
    }
}