import java.util.Scanner;

public class WaterDispenser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int glassMl = Integer.parseInt(scanner.nextLine());
        int ml = 0;
        String buttonType = "";

        while (ml < glassMl) {
            buttonType = scanner.nextLine();
            if (buttonType.equals("Easy")) {
                ml += 50;
            }
            if (buttonType.equals("Medium")) {
                ml += 100;
            }
            if (buttonType.equals("Hard")) {
                ml += 200;
            }
            counter++;
        }
        if (ml > glassMl) {

            System.out.printf("%dml has been spilled.", ml - glassMl);
            return;
        }
        System.out.printf("The dispenser has been tapped %d times.", counter);

    }
}


