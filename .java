import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		Random rand = new Random();
		int numberToGuesses = rand.nextInt(1000);
		int numberOfAttemps =0;
		Scanner input = new Scanner(System.in);
		int guess;
		boolean CorrectGuess = false;
                
                        System.out.println("Guess a number between 1 and 1000: ");
	
		while(CorrectGuess == false) {

			
			guess = input.nextInt();
			numberOfAttemps++;

			if ( guess == numberToGuesses) {
				CorrectGuess = true;
			}

			else if ( guess < numberToGuesses) {
				System.out.println(" guess is too low");
			}
	
			else if ( guess > numberToGuesses) {
				System.out.println(" guess is too high");
			}
		}

                System.out.println(numberToGuesses + " You guessed it in  " + numberOfAttemps + " steps");
        }
}
