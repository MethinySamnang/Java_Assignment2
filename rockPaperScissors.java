import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        int userWins = 0;
        int computerWins = 0;

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("First to lead by 3 points wins!");

        while (Math.abs(userWins - computerWins) < 3) {
            // User choice
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            // Validate user input
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid input. Please enter rock, paper, or scissors.");
                continue;
            }

            // Computer choice
            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            // Determine winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (userChoice.equals("rock") && computerChoice.equals("scissors") ||
            userChoice.equals("paper") && computerChoice.equals("rock") ||
            userChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win this round!");
                userWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }

            // Display current score
            System.out.println("Score - You: " + userWins + " | Computer: " + computerWins);
        }

        // Determine the final winner
        if (userWins - computerWins >= 3) {
            System.out.println("Congratulations! You won the game by 3 points!");
        } else {
            System.out.println("Computer wins the game by 3 points! Better luck next time.");
        }

        scanner.close();
    }
}