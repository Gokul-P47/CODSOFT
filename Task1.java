import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int attempts = 0;
        int score = 100;
        int choice=1;

        do {
            int randomNumber = random.nextInt(100) + 1;
            int guess = 0;
            System.out.println("A random number has been generated between 1 to 100.");

            while(guess != randomNumber) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if(guess < randomNumber) {
                    System.out.println("The guess is too low.");
                    score--;
                } else if(guess > randomNumber) {
                    System.out.println("The guess is too high.");
                    score--;
                } else {
                    System.out.println("Congrats! You have guessed the right number.");
                }
            }

            System.out.println("Number of attempts :" + attempts );
            System.out.println("Your score is: " + score);
            System.out.print("Do you want to play again? (Press 0 for No/Press other Number for No): ");
            choice = sc.nextInt();

        } while(choice!=0);

        sc.close();
    }
}
