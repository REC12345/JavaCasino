import java.util.Scanner;

public class Player
{
    public static void main(String[] args) 
    {
    //Starts the program
            Scanner theDealer = new Scanner(System.in);
            System.out.print("Welcome to the Casino.  Enter 'play' to start." );
            String userDecision = theDealer.nextLine();
            boolean play = (userDecision.equals("play"));

   //Starts the casino
            if(play == true)
            {
            //Starting balance
                System.out.println("How much money are you starting with?");
                double userBalance = theDealer.nextDouble();
                theDealer.nextLine();
                Casino theCasino = new Casino(userBalance);

                while(play == true)
                {   
                //Game choice
                    System.out.println("Which would you like to play?");
                    System.out.println("Blackjack\n Craps\n Roulette \n Slots\n");
                    String game = theDealer.nextLine();
                    
                    switch(game)
                    {
                        case "Blackjack" -> theCasino.playBlackjack();
                        case "Craps" -> theCasino.playCraps();
                        case "Roulette" -> theCasino.playRoulette();
                        case "Slots" -> theCasino.playSlots();
                        default -> System.out.println("Please enter a valid game.");
                    }
                //Play again
                    System.out.println("Enter 'play' to play again.");
                    userDecision = theDealer.nextLine();
                    play = userDecision.equals("play");
                }
                System.out.println(theCasino);
            }
        System.out.println("Thank You for Playing!");
    }
}