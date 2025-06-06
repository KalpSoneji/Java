package Basic;

import java.util.*;

public class Restaurant {

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        
    	int choice, Guj, Pun, Sin;
        int KhichdiQty = 0, TheplaQty = 0, DhoklaQty = 0;
        int SarsoQty = 0, MakkiQty = 0, CholeQty = 0;
        int IdliQty = 0, DosaQty = 0, VadaQty = 0;

        while (true) {
            System.out.print("Enter 1 for Gujarati, 2 for Punjabi, 3 for South Indian, 4 to Exit: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("Gujarati Menu:");
                        System.out.println("1. Khichdi (₹50)");
                        System.out.println("2. Thepla (₹15)");
                        System.out.println("3. Dhokla (₹40)");
                        System.out.println("4. Select another cuisine");
                        System.out.println("5. Exit and Print Bill");

                        System.out.print("Select an item: ");
                        Guj = sc.nextInt();

                        switch (Guj) {
                            case 1:
                                System.out.print("Enter quantity: ");
                                KhichdiQty += sc.nextInt();
                                break;
                            case 2:
                                System.out.print("Enter quantity: ");
                                TheplaQty += sc.nextInt();
                                break;
                            case 3:
                                System.out.print("Enter quantity: ");
                                DhoklaQty += sc.nextInt();
                                break;
                            case 4:
                                break;
                            case 5:
                                printBill(KhichdiQty, TheplaQty, DhoklaQty, SarsoQty, MakkiQty, CholeQty, IdliQty, DosaQty, VadaQty);
                                sc.close();
                                return;
                            default:
                                System.out.println("Invalid choice");
                        }
                        if (Guj == 4) break;
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("Punjabi Menu:");
                        System.out.println("1. Sarson Ka Saag (₹70)");
                        System.out.println("2. Makki Di Roti (₹20)");
                        System.out.println("3. Chole Bhature (₹50)");
                        System.out.println("4. Select another cuisine");
                        System.out.println("5. Exit and Print Bill");

                        System.out.print("Select an item: ");
                        Pun = sc.nextInt();

                        switch (Pun) {
                            case 1:
                                System.out.print("Enter quantity: ");
                                SarsoQty += sc.nextInt();
                                break;
                            case 2:
                                System.out.print("Enter quantity: ");
                                MakkiQty += sc.nextInt();
                                break;
                            case 3:
                                System.out.print("Enter quantity: ");
                                CholeQty += sc.nextInt();
                                break;
                            case 4:
                                break;
                            case 5:
                                printBill(KhichdiQty, TheplaQty, DhoklaQty, SarsoQty, MakkiQty, CholeQty, IdliQty, DosaQty, VadaQty);
                                sc.close();
                                return;
                            default:
                                System.out.println("Invalid choice");
                        }
                        if (Pun == 4) break;
                    }
                    break;

                case 3:
                    while (true) {
                        System.out.println("South Indian Menu:");
                        System.out.println("1. Idli (₹30)");
                        System.out.println("2. Dosa (₹80)");
                        System.out.println("3. Vada (₹40)");
                        System.out.println("4. Select another cuisine");
                        System.out.println("5. Exit and Print Bill");

                        System.out.print("Select an item: ");
                        Sin = sc.nextInt();

                        switch (Sin) {
                            case 1:
                                System.out.print("Enter quantity: ");
                                IdliQty += sc.nextInt();
                                break;
                            case 2:
                                System.out.print("Enter quantity: ");
                                DosaQty += sc.nextInt();
                                break;
                            case 3:
                                System.out.print("Enter quantity: ");
                                VadaQty += sc.nextInt();
                                break;
                            case 4:
                                break;
                            case 5:
                                printBill(KhichdiQty, TheplaQty, DhoklaQty, SarsoQty, MakkiQty, CholeQty, IdliQty, DosaQty, VadaQty);
                                sc.close();
                                return;
                            default:
                                System.out.println("Invalid choice");
                        }
                        if (Sin == 4) break;
                    }
                    break;

                case 4:
                    printBill(KhichdiQty, TheplaQty, DhoklaQty, SarsoQty, MakkiQty, CholeQty, IdliQty, DosaQty, VadaQty);
                    sc.close();
                    return;

                default:
                    System.out.println("Select a valid option.");
            }
        }
    }

    public static void printBill(int Khichdi, int Thepla, int Dhokla,
                                 int Sarso, int Makki, int Chole,
                                 int Idli, int Dosa, int Vada) {
        int total = 0;

        System.out.println("\n====== BILL DETAILS ======");
        if (Khichdi > 0) {
            System.out.println("Khichdi ₹50 x " + Khichdi + " = ₹" + (Khichdi * 50));
            total += Khichdi * 50;
        }
        if (Thepla > 0) {
            System.out.println("Thepla ₹15 x " + Thepla + " = ₹" + (Thepla * 15));
            total += Thepla * 15;
        }
        if (Dhokla > 0) {
            System.out.println("Dhokla ₹40 x " + Dhokla + " = ₹" + (Dhokla * 40));
            total += Dhokla * 40;
        }
        if (Sarso > 0) {
            System.out.println("Sarson Ka Saag ₹70 x " + Sarso + " = ₹" + (Sarso * 70));
            total += Sarso * 70;
        }
        if (Makki > 0) {
            System.out.println("Makki Di Roti ₹20 x " + Makki + " = ₹" + (Makki * 20));
            total += Makki * 20;
        }
        if (Chole > 0) {
            System.out.println("Chole Bhature ₹20 x " + Chole + " = ₹" + (Chole * 50));
            total += Chole * 50;
        }
        if (Idli > 0) {
            System.out.println("Idli ₹30 x " + Idli + " = ₹" + (Idli * 30));
            total += Idli * 30;
        }
        if (Dosa > 0) {
            System.out.println("Dosa ₹80 x " + Dosa + " = ₹" + (Dosa * 80));
            total += Dosa * 80;
        }
        if (Vada > 0) {
            System.out.println("Vada ₹40 x " + Vada + " = ₹" + (Vada * 40));
            total += Vada * 40;
        }

        System.out.println("--------------------------");
        System.out.println("Total Amount: ₹" + total);
        System.out.println("--------------------------");
    }
}