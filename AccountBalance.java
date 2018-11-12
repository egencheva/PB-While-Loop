import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());//Брой вноски
        int counter = 0;
        double amount = 0.00;
        double balance = 0.00;

        while (counter < n) {
            amount = Double.parseDouble(scanner.nextLine());
            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                balance += amount;
                System.out.printf("Increase: %.2f%n", amount);
            }
            counter++;
        }
        System.out.printf("Total: %.2f", balance);
    }
}
