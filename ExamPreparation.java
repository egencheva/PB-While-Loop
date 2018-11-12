import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fail = Integer.parseInt(scanner.nextLine());

        String input = "";
        String lastProblem = "";
        double score = 0;
        double avgScore = 0;
        int count = 0;
        int badGrades = 0;

        while (badGrades != fail) {
            input = scanner.nextLine();
            if (!input.equals("Enough")) {
                lastProblem = input;

            } else {
                System.out.printf("Average score: %.2f%n", avgScore/count);
                System.out.printf("Number of problems: %d%n", count);
                System.out.printf("Last problem: %s", lastProblem);
                return;
            }
            score = Integer.parseInt(scanner.nextLine());
            if (score <= 4) {
                badGrades++;
            }
            avgScore += score;
            count++;
        }
        System.out.printf("You need a break, %d poor grades.", badGrades);
    }
}
