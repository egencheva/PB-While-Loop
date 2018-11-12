import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        String action = "";

        int days = 0;
        int daySpend = 0;
        double sum = 0.0;


        while (money <= budget) {
            action = scanner.nextLine();
            sum = Double.parseDouble(scanner.nextLine());
            days++;

            if (action.equals("spend")) {
                daySpend++;
                if (money < sum) {
                    money = 0;
                } else {
                    money -= sum;
                }
            } else if (action.equals("save")) {
                daySpend = 0;
                money += sum;
            }
            if (daySpend >= 5) {
                System.out.println("You can't save the money.");
                System.out.print(days);
                break;
            }
            if (money >= budget) {
                System.out.printf("You saved the money for %d days.", days);
                break;
            }
        }
    }
}

