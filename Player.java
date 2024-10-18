import java.util.Scanner;

public class Player
{
    public static void main(String[] args) 
    {
        Scanner theDealer = new Scanner(System.in);

        System.out.println("Welcome to the Casino.  Enter 'play' to start or 'exit' to quit." );
        String userDecision = theDealer.nextLine();
        boolean play = (userDecision.equals("play"));

        /* while loop to keep the casino running until the player quits.
        * switch statements to see what game the user wants to play.
        */
        if(play == true)
        {
            //Asks the user for their starting balance
            System.out.println("How much money would you like to start with?");
            double userBalance = theDealer.nextDouble();
            Casino theCasino = new Casino(userBalance);

            while(play == true)
            {   //asks the user for the game that they want to play
                System.out.println("Which of the following would you like to play?\n");
                System.out.println("Blackjack\n Craps\n Roulette \n Slots\n");
                String game = theDealer.nextLine();
                
                switch(game)
                {
                    case "Blackjack":
                        theCasino.playBlackjack();
                    case "Craps":
                        theCasino.playCraps();
                    case "Roulette":
                        theCasino.playRoulette();
                    case "Slots":
                        theCasino.playSlots();
                    default:
                        System.out.println("Please make sure you entered a valid game.");
                }
                play = false;
            }
        }
        System.out.println("Thank You for Playing!");
    }

}
