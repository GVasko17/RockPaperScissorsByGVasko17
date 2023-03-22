import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
        private static final String ROCK = "Rock";
        private static final String PAPER = "Paper";
        private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose [r]ock, [p]aper or [p]cissors: ");

        String playerMove = scanner.nextLine();

        if (playerMove.equals("r") || playerMove.equals("rock")){
            playerMove = "Rock";
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove = "Paper";
        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = "Scissors";
        }else {
            System.out.println("Invalid input. Try again...");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);

        String computersMove = "";

        switch (computerRandomNumber){
            case 1:
                computersMove = "Rock";
                break;
            case 2:
                computersMove = "Paper";
                break;
            case 3:
                computersMove = "Scissors";
                break;
            default:
                return;
        }

        System.out.printf("The computer chose %s.%n", computersMove);

        if (playerMove.equals("Rock") && computersMove.equals("Scissors") ||
        playerMove.equals("Scissors") && computersMove.equals("Paper") ||
                playerMove.equals("Paper") && computersMove.equals("Rock")) {
            System.out.println("You win.");
        } else if (computersMove.equals("Rock") && playerMove.equals("Scissors") ||
        computersMove.equals("Scissors") && playerMove.equals("Paper") ||
        computersMove.equals("Paper") && playerMove.equals("Rock")) {
            System.out.println("You lose.");
        } else if (playerMove.equals("Rock") && computersMove.equals("Rock") ||
        playerMove.equals("Scissors") && computersMove.equals("Scissors") ||
        playerMove.equals("Paper") && computersMove.equals("Paper")) {
            System.out.println("This game was a draw");
        }



    }
    }
