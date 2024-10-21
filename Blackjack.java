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
    public int[] getPlayerHand()
    {
        return playerHand;
    }
    public int[] getDealerHand()
    {
        return dealerHand;
    }

    public void playerHit(int i)
    {
        playerHand[i] = 0;
    }
    public void dealerHit(int j)
    {
        dealerHand[j] = 0;
    }




//toString(Returns amount won/lost and a 'thank you for playing' message)
    public String toString()
    {
        return "Payout: " + payout + "$\nFinal Balance: " + balance + "$";
    }
}
