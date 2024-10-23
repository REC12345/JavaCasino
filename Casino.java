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
        int playersHits = 0; //Keep track of the number of hits

        System.out.println("Dealer's hand: "); 
        System.out.println(newGame.getDealerHand());
        int dealersHits = 0; //Keep track of the number of hits

        System.out.println("Enter 'hit' to hit or 'stay' to stay.");
        String hit = theDealer.nextLine();

    //Player hits
        while(hit.equals("hit"))
        {
            newGame.playerHit(playersHits);
            System.out.println(newGame.getPlayerHand());
            playersHits++;
            System.out.println("Enter 'hit' to hit or 'stay' to stay.");
            hit = theDealer.nextLine();
        }
    
    //Dealer hits (Change 0 to the sum of the dealers cards)
        while((0) < 17)
        {
            newGame.dealerHit(dealersHits);
            System.out.println(newGame.getDealerHand());
            dealersHits++;
        }
    
    //Checks to see who wins
        if((newGame.getPlayerTotal())>(newGame.getDealerTotal()))
        {
            System.out.println("You won!");
        }
        else if((newGame.getPlayerTotal())==(newGame.getDealerTotal()))
        {
            System.out.println("Tie!  Nobody wins...");
        }
        else
        {
            System.out.println("Dealer won, better luck next time!");
        }

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
