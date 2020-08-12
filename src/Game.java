import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int userRange;
    private int minValue;
    private int maxValue;

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
        maxValue = userRange;
        minValue = 1;
    }
    private int guessNumber() {
        Random random = new Random();
        return random.nextInt(maxValue -1) + minValue;
    }
    private void response(int guess) {
        Scanner scanner = new Scanner(System.in);
        int response;
        while (true) {
            try {
                System.out.print("input -1 when it's bigger than your number, 1 when it's smaller, or 0 when it's correct: ");
                response = scanner.nextInt();
                if (userRange != -1 || userRange != 0 || userRange != 1) {
                    throw new InputMismatchException("Out of range");
                }
                break;
            }catch (InputMismatchException e) {
                System.out.println("The input must be 1, 0, or -1.");
            }
        }
        if (response == 1) {
            minValue = guess;
        } else if(response == -1) {
            maxValue = guess;
        }

    }
}
