import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int countYears = 0;
        String name = scanner.nextLine();
        double grade = 0.00;
        double sum = 0.00;
        double result = 0.00;

        while(count<12){
            grade = Double.parseDouble(scanner.nextLine());
            if(grade < 4.00){
                countYears++;
                if(countYears>1){
                    System.out.printf("%s has been excluded at %d grade", name, count);
                    return;
                }
            }
            sum += grade;
            count++;
        }
        result = sum/12;
        System.out.printf("%s graduated. Average grade: %.2f", name, result);

    }
}