import java.util.Scanner;

public class Casino
{
//Scanner
    Scanner theDealer = new Scanner(System.in);
//Variables
    private double balance;
//Constructors
    public Casino(double b)
    {
        balance = b;
    }
    public Casino()
    {
        balance = 0.0;
    }

//Methods(Games)
    public void playBlackjack()
    {
    //Game created
        Blackjack newGame = new Blackjack(balance);
        System.out.println("Welcome to BlackJack!\n");

        System.out.println("Your hand: ");
        System.out.println(newGame.getPlayerHand());
        int i = 0; //User's most recent hit

        System.out.println("Dealer's hand: "); 
        System.out.println(newGame.getDealerHand());
        int j = 0; //Dealer's most recent hit

        System.out.println("Enter 'hit' to hit or 'stay' to stay.");
        String hit = theDealer.nextLine();

    //Player hits
        while(hit.equals("hit"))
        {
            newGame.playerHit(i);
            System.out.println(newGame.getPlayerHand());
            i++;
            System.out.println("Enter 'hit' to hit or 'stay' to stay.");
            hit = theDealer.nextLine();
        }
    
    //Dealer hits (Change j to the sum of the dealers cards)
        while((j) < 17)
        {
            newGame.dealerHit(j);
            System.out.println(newGame.getDealerHand());
            j++;
        }
    
    //Checks to see who wins
        

    //Payout and balance are printed
        System.out.println(newGame);
    }

    
    public void playCraps()
    {
        //Craps newGame = new Craps(balance);
    }
    public void playSlots()
    {
        //Slots newGame = new Slots(balance);
    }
    public void playRoulette()
    {
        //Roulette newGame = new Roulette(balance);
    }
    
//toString
    public String toString()
    {
        return "Current Balance: " + balance;
    }
}
