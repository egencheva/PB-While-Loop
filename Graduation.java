import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int counter = 1;
        double sum = 0;


        while (counter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) ;
            {
                sum += grade;
                counter++;
            }
        }
        double averageSum = sum / 12;
        if (averageSum >= 4) {
            System.out.printf("%s graduated. Average grade: %.2f", name, averageSum);
        }
    }
}
