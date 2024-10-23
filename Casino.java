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

    //Hands created
        int playersHits = 0;
        newGame.playerHit(playersHits);
        newGame.playerHit(playersHits);

        int dealersHits = 0;
        newGame.dealerHit(dealersHits);
    
    //Hands shown
        System.out.println("Your hand: ");
        System.out.println(newGame.getPlayerHand());

        System.out.println("Dealer's hand: "); 
        System.out.println(newGame.getDealerHand());
        newGame.dealerHit(dealersHits);

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
    
    //Dealer hits
        while((newGame.getDealerTotal()) < 17)
        {
            newGame.dealerHit(dealersHits);
            System.out.println(newGame.getDealerHand());
            dealersHits++;
        }

    //Winner, Payout, and balance are printed
        System.out.println(newGame.getWinner());
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
