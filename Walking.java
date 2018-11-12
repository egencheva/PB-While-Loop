import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = 0;
        int stepsHome = 0;
        int sumSteps = 0;
        String input = scanner.nextLine();

        while (!input.equals("Going home")) {
            steps = Integer.parseInt(input);
            sumSteps += steps;
            if (sumSteps >= 10000) {
                System.out.printf("Goal reached! Good job!");
                break;
            } else {
                input = scanner.nextLine();
            }
        }
        if (input.equals("Going home") || sumSteps < 10000) {
            stepsHome = Integer.parseInt(scanner.nextLine());
            sumSteps = sumSteps + stepsHome;
            if (sumSteps < 10000) {
                System.out.printf("%d more steps to reach goal.", (10000 - sumSteps));
            } else {
                System.out.printf("Goal reached! Good job!");
            }
        }
    }
}
