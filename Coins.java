import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double resto = Double.parseDouble(scanner.nextLine());
        double restoToInt = resto * 100;
        int restoInt = (int) restoToInt;
        int countCoins = 0;

        while (restoInt > 0) {
            if (restoInt - 200 > 0) {
                countCoins++;
                restoInt = restoInt - 200;
            } else if (restoToInt - 200 == 0) {
                countCoins++;
                return;
            }
            if (restoInt - 100 > 0) {
                countCoins++;
                restoInt = restoInt - 100;
            } else if (restoToInt - 100 == 0) {
                countCoins++;
                return;
            }
            if (restoInt - 50 > 0) {
                countCoins++;
                restoInt = restoInt - 50;
            } else if (restoToInt - 50 == 0) {
                countCoins++;
                return;
            }
            if (restoInt - 20 > 0) {
                countCoins++;
                restoInt = restoInt - 20;
            } else if (restoToInt - 20 == 0) {
                countCoins++;
                return;
            }
            if (restoInt - 10 > 0) {
                countCoins++;
                restoInt = restoInt - 10;
            } else if (restoToInt - 10 == 0) {
                countCoins++;
                return;
            }
            if (restoInt - 5 > 0) {
                countCoins++;
                restoInt = restoInt - 5;
            } else if (restoToInt - 5 == 0) {
                countCoins++;
                return;
            }
            if (restoInt - 2 > 0) {
                countCoins++;
                restoInt = restoInt - 2;
            } else if (restoToInt - 2 == 0) {
                countCoins++;
                return;
            }
            if (restoInt - 1 > 0) {
                countCoins++;
                restoInt = restoInt - 1;

            } else if (restoToInt - 1 == 0) {
                countCoins++;
                return;
            }
        }
        System.out.print(countCoins);
    }
}
