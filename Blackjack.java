
import java.util.Arrays;


public class Blackjack 
{
//Variables
    private double balance;
    private double payout;
    private int[] playerHand;
    private int[] dealerHand;

//Constructors
    public Blackjack(double b)
    {
        balance = b;
        payout = 0.0;
        playerHand = new int[10];
        dealerHand = new int[10];
    }
    public Blackjack()
    {
        balance = 0.0;
        payout = 0.0;
        playerHand = new int[10];
        dealerHand = new int[10];
    }

//Methods(Game actions)
    public String getPlayerHand()
    {
        return (Arrays.toString(playerHand));
    }
    public String getDealerHand()
    {
        return (Arrays.toString(dealerHand));
    }

    public void playerHit(int i)
    {
        playerHand[i] = (int)(Math.random() * 14);
    }
    public void dealerHit(int j)
    {
        dealerHand[j] = (int)(Math.random() * 14);
    }




//toString(Returns amount won/lost and a 'thank you for playing' message)
    public String toString()
    {
        return "Payout: " + payout + "$\nFinal Balance: " + balance + "$";
    }
}
