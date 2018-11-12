import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("END")) break;
            int num = Integer.parseInt(command);
            if (num < smallest) smallest = num;
            if (num > biggest) biggest = num;
        }
        System.out.printf("Max number: %d\n", biggest);
        System.out.printf("Min number: %d", smallest);
    }
}
