import javax.swing.JOptionPane;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        int totalScore = 0;
        int rounds = 3;

        JOptionPane.showMessageDialog(null, "Welcome to the Number Guessing Game!");

        for (int round = 1; round <= rounds; round++) {
            int randomNumber = new Random().nextInt(100) + 1; // 1 to 100
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessedCorrectly = false;

            while (attempts < maxAttempts) {
                String input = JOptionPane.showInputDialog(
                        "Round " + round + ": Guess the number (1 to 100)\nAttempt " + (attempts + 1) + " of " + maxAttempts);

                if (input == null) {
                    JOptionPane.showMessageDialog(null, "Game cancelled!");
                    return;
                }

                int guess;
                try {
                    guess = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number.");
                    continue;
                }

                attempts++;

                if (guess == randomNumber) {
                    JOptionPane.showMessageDialog(null, "Correct! You guessed the number in " + attempts + " attempts.");
                    int score = (maxAttempts - attempts + 1) * 10;
                    totalScore += score;
                    JOptionPane.showMessageDialog(null, "You scored " + score + " points this round.");
                    guessedCorrectly = true;
                    break;
                } else if (guess < randomNumber) {
                    JOptionPane.showMessageDialog(null, "Too low! Try again.");
                } else {
                    JOptionPane.showMessageDialog(null, "Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                JOptionPane.showMessageDialog(null, "You failed to guess the number. It was: " + randomNumber);
            }
        }

        JOptionPane.showMessageDialog(null, "Game Over!\nTotal Score: " + totalScore + " points\nThank you for playing!");
    }
}
