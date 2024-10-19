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
        System.out.println("Dealer's hand: ");
        System.out.println("Enter 'hit' to hit or 'stay' to stay.");

        String hit = theDealer.nextLine();
        if(hit.equals("hit"))
        {
            newGame.playerHit();
            System.out.println(newGame.getPlayerHand());
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
