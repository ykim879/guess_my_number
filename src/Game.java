import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private int userRange;

    public Game() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Select the range of the integer N((1 ≤ N ≤ 10E9): ");
                userRange = scanner.nextInt();
                if (userRange < 1 || userRange > 10E9) {
                    throw new InputMismatchException("Out of range");
                }
                break;
            }catch (InputMismatchException e) {
                System.out.println("The input has to be the integer N((1 ≤ N ≤ 10E9). Type again: ");
            }
        }
    }
}
