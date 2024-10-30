import java.util.Scanner;

public class Player
{
    public static void main(String[] args) 
    {
        Scanner theDealer = new Scanner(System.in);

        System.out.print("Welcome to the Casino. How much money will you be playing with?");
        double userBalance = theDealer.nextDouble();

        Casino theCasino = new Casino(userBalance);
        String keepPlaying;

        do
        {
            System.out.println("Choose your game: Blackjack\n");
            String game = theDealer.nextLine();
            
            switch(game)
            {
                case "Blackjack" -> theCasino.playBlackjack();
                default -> System.out.println("Please enter a valid game.");
            }

            System.out.println("Enter 'play' to play again.");
            keepPlaying = theDealer.nextLine();

        }while(keepPlaying.equals("play"));

        System.out.println(theCasino);
    }
}