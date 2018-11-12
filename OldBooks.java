import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String book = scanner.nextLine();
        int library = Integer.parseInt(scanner.nextLine());
        int count = 0;

        while (true) {
           String wantedBook = scanner.nextLine();
            if (wantedBook.equals(book)) {
                System.out.printf("You checked %d books and found it.", count );
                break;
            }
            count++;
            if (!wantedBook.equals(book) && count == library) {
                System.out.printf("The book you search is not here!%nYou checked %d books.", count);
                break;
            }
        }
    }
}