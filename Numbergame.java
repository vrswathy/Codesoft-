import java.util.Random;
import java.util.Scanner;

public class Numbergame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        char playAgain;

        do {
            int number = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("\nA number between 1 and 100 has been generated.");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct guess.");
                    System.out.println("Attempts used: " + attempts);
                    score++;
                    guessedCorrectly = true;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high.");
                } else {
                    System.out.println("Too low.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Attempts over.");
                System.out.println("Correct number: " + number);
            }

            System.out.print("Play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Game ended.");
        System.out.println("Total score: " + score);

        sc.close();
    }
}
    

