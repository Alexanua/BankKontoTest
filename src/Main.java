import account.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


     Account account=new Account(1500,"19876653");
        while(true) {
            System.out.println("Välj ett alternativ:");
            System.out.println("1. Visa balans");
            System.out.println("2. Gör en insättning");
            System.out.println("3. Gör ett uttag");
            System.out.println("4. Avsluta");

            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Ditt saldo är: " + account.getBalance()+"  kr");
                    break;
                case 2:
                    System.out.println("Ange belopp att sätta in:");
                    int depositAmount = scanner.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Ange belopp att ta ut:");
                    int withdrawAmount = scanner.nextInt();
                   account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Avslutar...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Ogiltigt alternativ. Försök igen.");
                    break;
            }
        }
    }
}
