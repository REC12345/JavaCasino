import java.util.Scanner;

public class Player
{
    public static void main(String[] args) 
    {
        Scanner theDealer = new Scanner(System.in);

        System.out.print("Welcome to the Casino. How much money are you starting with?");
        double userBalance = theDealer.nextDouble();
        theDealer.nextLine();

        Casino theCasino = new Casino(userBalance);
        String keepPlaying;

        do
        {
            System.out.println("Choose your game: \nBlackjack\nCraps\nRoulette\nSlots\n");
            String game = theDealer.nextLine();
            
            switch(game)
            {
                case "Blackjack" -> theCasino.playBlackjack();
                case "Craps" -> theCasino.playCraps();
                case "Roulette" -> theCasino.playRoulette();
                case "Slots" -> theCasino.playSlots();
                default -> System.out.println("Please enter a valid game.");
            }

            System.out.println("Enter 'play' to play again.");
            keepPlaying = theDealer.nextLine();

        }while(keepPlaying.equals("play"));

        System.out.println(theCasino);
    }
}