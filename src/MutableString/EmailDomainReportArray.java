package MutableString;
import java.util.Scanner;
import java.util.regex.*;

public class EmailDomainReportArray {

    // Validate email using regex
    public static boolean isValidEmail(String email) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] domains = new String[100];  
        int[] counts = new int[100];         
        int domainIndex = 0;                 

        System.out.print("Enter number of email addresses: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.println("Enter " + n + " email addresses:");
        for (int i = 0; i < n; i++) {
            String email = sc.nextLine().trim();

            if (isValidEmail(email)) {
                String domain = email.substring(email.indexOf("@") + 1);

                boolean found = false;
                for (int j = 0; j < domainIndex; j++) {
                    if (domains[j].equals(domain)) {
                        counts[j]++;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    domains[domainIndex] = domain;
                    counts[domainIndex] = 1;
                    domainIndex++;
                }
            }
        }

        System.out.println("\nDomain Report:");
        for (int i = 0; i < domainIndex; i++) {
            System.out.println(domains[i] + " -> " + counts[i] + (counts[i] == 1 ? " employee" : " employees"));
        }

        sc.close();
    }
}