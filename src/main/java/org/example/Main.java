import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Initialize Scanner for user input and Random for number generation
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int Target = random.nextInt(100) + 1;
        int Attempts = 0;
        int MAX_ATTEMPTS = 5;

        // Welcome message and instructions
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You Will Be Asked To Guess A Number To Win The Game");
        System.out.println("You have Maximum 5 Attempt Limit");

        while (Attempts < MAX_ATTEMPTS) {
            System.out.println("Enter a guess number between 1 to 100 ");
                int guess = sc.nextInt();
                 Attempts+=1 ;

                // Provide feedback on the guess
                if (guess < Target) {
                    System.out.println("Your Guess Number is Smaller.");
                } else if (guess > Target) {
                    System.out.println("Your Guess Number is Greater.");
                } else {
                    System.out.println("OOhhOO! Your Number is Correct. You Win the Game!");
                    break;
                }
            }

            if (Attempts == MAX_ATTEMPTS) {
                System.out.println("Sorry, you've used all " + MAX_ATTEMPTS + " attempts. The number was " + Target + ".");
            }
        }

    }

