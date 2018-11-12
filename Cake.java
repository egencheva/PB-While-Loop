import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wight = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cakeTtl = wight * length;
        int cakesInt = 0;
        int sumCakes = 0;


        while (true) {
            String cakes = scanner.nextLine();
            if (cakes.equals("STOP")) {
                System.out.printf("%d pieces are left.", cakeTtl - sumCakes);
                break;
            }

            cakesInt = Integer.parseInt(cakes);
            sumCakes += cakesInt;
            if (sumCakes > cakeTtl) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(sumCakes - cakeTtl));
                break;

            }
        }
    }
}




