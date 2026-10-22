import java.util.Scanner;

public class get_verbs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String verb = get_verb(scanner);
        System.out.println("You entered the verb: " + verb);
        scanner.close();
    }

    public static String get_verb(Scanner scanner) {
        System.out.print("Enter a verb: ");
        String verbInput = scanner.nextLine();
        return verbInput;
    }
}
