import java.util.Scanner;

public class GratestCOmmonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int NOD = a % b;

        while (b != 0) {
            NOD = a % b;
            a = b;
            b = NOD;
                    }
        System.out.println(a);
    }
}
