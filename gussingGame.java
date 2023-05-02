import java.util.Random;
import javax.swing.JOptionPane;

public class gussingGame {
    public static void main(String[] args) {
        int rangeMin = 1;
        int rangeMax = 100;
        int attempts = 5;
        int score = 0;
        
        Random rand = new Random();
        int secretNumber = rand.nextInt(rangeMax - rangeMin + 1) + rangeMin;
        
        boolean guessed = false;
        while (!guessed && attempts > 0) {
            String guessStr = JOptionPane.showInputDialog(null,
                "Guess the secret number between " + rangeMin + " and " + rangeMax +
                "\nAttempts left: " + attempts +
                "\nScore: " + score);
            
            if (guessStr == null) {
                // User pressed Cancel or X on the dialog
                break;
            }
            
            int guess = Integer.parseInt(guessStr);
            if (guess == secretNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the secret number!");
                guessed = true;
            } else if (guess < secretNumber) {
                JOptionPane.showMessageDialog(null, "The secret number is higher than your guess.");
                score += attempts;
                attempts--;
            } else {
                JOptionPane.showMessageDialog(null, "The secret number is lower than your guess.");
                score += attempts;
                attempts--;
            }
        }
        
        if (!guessed) {
            JOptionPane.showMessageDialog(null, "Sorry, you didn't guess the secret number. It was " + secretNumber);
        }
    }
}
