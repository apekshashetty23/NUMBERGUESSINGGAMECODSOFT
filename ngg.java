import java.util.Random;
import java.util.Scanner;
public class ngg 
{
    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Welcome to the Number Guessing Game! How many rounds would you like to play? ");
        int rnds = in.nextInt();
        int total= 0;
        for (int rndbr=1;rndbr<= rnds;rndbr++)
			{
            System.out.println("\nRound " + rndbr + ":");
            int secnbr= r.nextInt(100) + 1;
            int attempt= 0;
            int max=10;
            boolean guess= false;
            while (attempt< max&& !guess) 
			{
                System.out.print("Take a guess (between 1 and 100): ");
                int pguess = in.nextInt();
                attempt++;
                if (pguess< secnbr) 
				{
                    System.out.println("Oops! Your guess is too low. Try again!");
                } 
				else if (pguess> secnbr) 
				{
                    System.out.println("Oh no! Your guess is too high. Give it another shot!");
                } 
				else 
				{
                    System.out.println("Hooray! You've guessed the number correctly!");
                    guess= true;
                }
            }
            if (!guess) 
			{
                System.out.println("Sorry, you've used all your attempts. The secret number was " + secnbr);
            }
            int score = Math.max(0, (max- attempt) * 10);
            total+= score;
            System.out.println("Your score for this round: " + score);
        }
        System.out.println("\nGame Over! Your total score: " + total);
    }
}