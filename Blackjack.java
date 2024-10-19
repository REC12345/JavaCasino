public class Blackjack 
{
//Variables
    private double balance;
    private double payout;
    private int playerHand;
    private int dealerHand;

//Constructors
    public Blackjack(double b)
    {
        balance = b;
        payout = 0.0;
        playerHand = 0;
        dealerHand = 0;
    }
    public Blackjack()
    {
        balance = 0.0;
        payout = 0.0;
        playerHand = 0;
        dealerHand = 0;
    }

//Methods(Game actions)
    public int getPlayerHand()
    {
        return playerHand;
    }
    public int getDealerHand()
    {
        return dealerHand;
    }

    public void playerHit()
    {
        playerHand += 0;
    }
    public void dealerHit()
    {
        dealerHand += 0;
    }




//toString(Returns amount won/lost and a 'thank you for playing' message)
    public String toString()
    {
        return "Payout: " + payout + "$\nFinal Balance: " + balance + "$";
    }
}
