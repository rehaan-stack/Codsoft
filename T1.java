import java.util.Random;
import java.util.Scanner;

public class T1 {

    int score = 0;

    T1()// constructor
    {
        String playAgain = "";
        function_1(playAgain);
    }// constr end -1
     //////////

    int function_1(String playAgain) {
        Scanner scanner = new Scanner(System.in);// scanner
        Random random = new Random();// random
        do {// do-while start
            int attempts = 5;// vara
            int numberToGuess = random.nextInt(100) + 1;// varia
            System.out.println("Guess a number between 1 and 100. You have " + attempts + " attempts.");
            attem_numberguessing_function(attempts, numberToGuess);
            System.out.println("Your score is: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));// do while condion end
        System.out.println("Thank you for playing. Your final score is: " + score);
        scanner.close();
        return 0;
    }
    /// function 1 end
    /////////

    int attem_numberguessing_function(int attem, int numberguess)// function 2 end here
    {
        int attempt = attem;
        int numberguss = numberguess;
        Scanner scanner = new Scanner(System.in);
        while (attempt-- > 0) {// while condition
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();// temporrary varible is guess
            if (guess == numberguss) {// if else if
                System.out.println("Congratulations! You guessed the number.");
                score += 1000;
                break;
            } else if (guess < numberguss) {
                int guess_low = numberguss + 12;
                int guess_low2 = numberguss - 9;
                System.out.println("Too low!");
                System.out.println("The gussing number is between " + guess_low + " to " + guess_low2);
            } else {
                int guess_low3 = numberguss + 18;
                int guess_low4 = numberguss - 7;

                System.out.println("Too high!");
                System.out.println("The gussing number is between " + guess_low3 + " to " + guess_low4);
            } // end of if else if

            if (attempt > 0) {// if else
                System.out.println("You have " + attempt + " attempts left. Try again.");

            } else {
                System.out.println("You've used all your attempts. The number was " + numberguss);
            }
        } // while condion end
        return 0;
    }
    // function 2 end here
    /////// /////////

    public static void main(String[] args) {
        T1 t = new T1();
        // main function //
    }
}
